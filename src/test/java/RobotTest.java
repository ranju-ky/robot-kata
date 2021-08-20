import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotTest {
    @Test
    void siTuSaludasHolaRobotDeVuelveHola (){
        SaludoRobort saludo = new SaludoRobort();
        String respuesta = saludo.respuesta("Hola Robot");
        assertThat(respuesta, equalTo("Hola"));
    }

    @Test
    void siTuPreguntasQueTiempoHaceEnMadridDevulveTeVasAMadridYMriras (){
        SaludoRobort tiempo = new SaludoRobort();
        String respuesta = tiempo.respuesta("que tiempo hace madrid");
        assertThat(respuesta, equalTo("te vas a madrid y miras"));
    }

}
