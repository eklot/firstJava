public class PetRock {
    private String name;
    private boolean happy = false;
    PetRock(String name)
    {
        this.name = name;
        if(this.name.isEmpty())
        {
            throw new IllegalStateException();
        }
    }
    public String getName(){ return this.name; }
    public boolean isHappy(){ return happy; }
    public void playWhithRock(){ this.happy = true; }
    public String getHappyMessage()
    {
        if(!happy)
        {
            //throw new IllegalStateException();
        }
        return "I'm happy!";
    }

    public void waitTillHappy()
    {
        while(!happy)
        {
            // do nothing
        }
    }
}
