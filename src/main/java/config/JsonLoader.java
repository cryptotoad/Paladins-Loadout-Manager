/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import championDefs.Champion;
import championDefs.Skill;
import championDefs.Talent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;



/**
 *
 * @author toad
 */
public class JsonLoader {
    private static final String jsonPath = "./data/champions/";
    
    public static Champion loadJson(String champName) throws Exception {
        Gson gson = new Gson();
        Champion conf;
        conf = gson.fromJson(new FileReader(jsonPath + champName + ".json"), Champion.class);
        return conf;
    }
    
    public static void load() throws Exception {
        Champion testChamp = new Champion();
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting().serializeNulls();
        Gson gson = builder.create();
        testChamp.name = "Test Champion";
        testChamp.altFire = new Skill();
        testChamp.altFire.name = "altFire";
        testChamp.mainFire = new Skill();
        testChamp.mainFire.name = "mainFire";
        testChamp.moveSkill = new Skill();
        testChamp.moveSkill.name = "moveSkill";
        testChamp.utilitySkill = new Skill();
        testChamp.utilitySkill.name = "moveSkill";
        testChamp.ultimate = new Skill();
        testChamp.ultimate.name = "ultimate";
        System.out.println(gson.toJson(testChamp));
        Talent.applyModifications(testChamp, "agony");
    }
}
