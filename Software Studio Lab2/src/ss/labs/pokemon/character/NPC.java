package ss.labs.pokemon.character;

/**
 * Created by jerry on 2017/3/7.
 */
public class NPC extends AbstractCharacter {

    //TODO more attributes are needed
    protected String quote;
    //TODO solve the error
    public NPC(String name,String job,String quote){
        //TODO call super constructor
        super(name, job);
        //TODO assign attribute
        this.quote = quote;
    }

    public void interact()
    {
        speak();
    }

    public void speak(){
        //TODO NPC say something...
        System.out.println(quote);
    }

    //TODO override toString()
    public String toString() {
        return "name : " + name + "\n" + "job : " + job + "\n" + "quote : " + quote + "\n";
    }

    @Override
    public void showInformation() {
        System.out.println(toString());
    }
}
