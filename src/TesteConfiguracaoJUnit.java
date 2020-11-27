import org.junit.Assert;
import org.junit.Test;

public class TesteConfiguracaoJUnit {

    @Test
    public void TesteConfiguracao(){
        Assert.assertEquals(2,(1+1),0);
    }

    @Test
    public void TesteConfiguracaoNegativo(){
        Assert.assertEquals(2,(2+1),0);
    }

}
