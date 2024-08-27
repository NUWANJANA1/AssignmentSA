package question_1;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
    this.light = light;
    }

    @Override
    public void execute() {
    light.off();
    }

    @Override
    public void undo() {
    light.on();
    }
    
    @Override
    public int BrightnessLevel() {
    
        throw new UnsupportedOperationException("Unimplemented method 'BrightnessLevel'");
    }
   }

