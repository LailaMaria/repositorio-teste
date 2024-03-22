package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public")
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @param id
 *
 * @author Laila Maria Vieira Souza
 * @since 20/03/2024, 15:04:36
 *
 */
public static Var turmaAlunos(@ParamMetaData(description = "id2", id = "570b53bc") Var id2) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(id2.equals(
    Var.valueOf("72"))).getObjectAsBoolean()) {
        System.out.println(
        cronapi.list.Operations.newList(
        Var.valueOf("Pedro"),
        Var.valueOf("Maria")).getObjectAsString());
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

