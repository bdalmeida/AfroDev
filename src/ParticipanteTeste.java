import org.junit.Assert;
import org.junit.Test;

public class ParticipanteTeste {

    Participante p = new Participante();

    @Test
    public void TestSetNome(){
        p.nome("Bruno");
        Assert.assertEquals("Bruno",p.nome);
    }

    @Test
    public void TestSetIdade(){
        p.idade(29);
        Assert.assertEquals(29,p.idade);
    }

}
