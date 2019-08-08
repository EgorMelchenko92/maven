public abstract class Maintest {

    public abstract Animal getName();

    public void testGo() {
        Animal name = getName();
        String result = name.go();
        if (result == null || result.isEmpty()) {
            throw new RuntimeException("method go is not implement");
        }
    }

    public void testGetLegs() {
        Animal name = getName();
        Integer result = name.getLegs();
        if (result == null) {
            throw new RuntimeException("error in the getLegs method");
        }
        if (result < 2 || result > 4) {
            throw new RuntimeException("error in the getLegs method");
        }
    }

    public void testVoice() throws VoiceException {
        Animal name = getName();
        String result = name.voice();
        if (result == null || result.isEmpty()) {
            throw new RuntimeException("method voice is not implement");
        }
        if (result.length() > 10) {
            throw new RuntimeException("character input limit exceeded");
        }
        if (result.matches("[0-9]+")) {
            throw new RuntimeException("wrong character");
        }
    }

}
