/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championDefs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/**
 *
 * @author toad
 */
public class Talent {
    //Due to the nature of talents, it's easiest to define them using scripts
    //There are simply too many variables that would be needed to apply them with JSON configs.
    
    private static ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    private static final String baseScriptPath = "./data/scripts/";
    
    public static String applyModifications(Champion target, String talentName) throws Exception {
        String scriptPath = baseScriptPath + target.name + "/talents/" + talentName + ".js";
        File f = new File(scriptPath);
        if(!f.exists()) {
            return "Error! Invalid talent!";
        }
        engine.eval(new FileReader(scriptPath));
        Invocable run = (Invocable) engine;
        Object result = run.invokeFunction("talent", target);
        return (String) result;
    }
}
