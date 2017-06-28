package com.example.caitlin.crealchemy;

import android.app.IntentService;
import android.app.backup.BackupManager;
import android.content.Intent;

import java.util.ArrayList;

public class FirstCreateIntentService extends IntentService{
    private static final String TAG = "FirstCreateIntent";

    private static final String NAME_WATER = "Water";
    private static final String NAME_FIRE = "Fire";
    private static final String NAME_AIR = "Air";
    private static final String NAME_EARTH = "Earth";
    private static final String NAME_STEAM = "Steam";
    private static final String NAME_ENERGY = "Energy";
    private static final String NAME_RAIN = "Rain";
    private static final String NAME_DUST = "Dust";
    private static final String NAME_GEYSER = "Geyser";
    private static final String NAME_DIRT = "Dirt";
    private static final String NAME_MUD = "Mud";
    private static final String NAME_CLOUD = "Cloud";
    private static final String NAME_WIND = "Wind";
    private static final String NAME_PRESSURE = "Pressure";
    private static final String NAME_SEDIMENTARYROCK = "Sedimentary Rock";
    private static final String NAME_LAVA = "Lava";
    private static final String NAME_VOLCANO = "Volcano";
    private static final String NAME_ERUPTION = "Eruption";
    private static final String NAME_TROPICALSTORM = "Tropical Storm";
    private static final String NAME_HURRICANE = "Hurricane";
    private static final String NAME_ICE = "Ice";
    private static final String NAME_IGNEOUSROCK = "Igneous Rock";
    private static final String NAME_SAND = "Sand";
    private static final String NAME_BEACH = "Beach";
    private static final String NAME_GLACIER = "Glacier";
    private static final String NAME_ICEBERG = "Iceberg";
    private static final String NAME_GUNPOWDER = "Gunpowder";
    private static final String NAME_METAL = "Metal";
    private static final String NAME_PLANT = "Plant";
    private static final String NAME_GLASS = "Glass";
    private static final String NAME_TIME = "Time";
    private static final String NAME_TREE = "Tree";
    private static final String NAME_SWAMP = "Swamp";
    private static final String NAME_EXPLOSION = "Explosion";
    private static final String NAME_LIFE = "Life";
    private static final String NAME_HUMAN = "Human";
    private static final String NAME_TOOL = "Tool";
    private static final String NAME_WOOD = "Wood";
    private static final String NAME_HOUSE = "House";
    private static final String NAME_MANSION = "Mansion";
    private static final String NAME_CASTLE = "Castle";
    private static final String NAME_FURNITURE = "Furniture";
    private static final String NAME_THRONE = "Throne";
    private static final String NAME_TREEHOUSE = "Treehouse";
    private static final String NAME_KING = "King";
    private static final String NAME_LOVE = "Love";
    private static final String NAME_CHILD = "Child";
    private static final String NAME_BABYBREATH = "Baby Breath";
    private static final String NAME_PAPER = "Paper";
    private static final String NAME_WALLPAPER = "Wallpaper";
    private static final String NAME_BEACHHOUSE = "Beach House";
    private static final String NAME_ROSE = "Rose";
    private static final String NAME_SKY = "Sky";
    private static final String NAME_STAR = "Star";
    private static final String NAME_SUN = "Sun";
    private static final String NAME_SMOKE = "Smoke";
    private static final String NAME_DAY = "Day";
    private static final String NAME_MOON = "Moon";
    private static final String NAME_NIGHT = "Night";
    private static final String NAME_EARTHQUAKE = "Earthquake";
    private static final String NAME_MOUNTAIN = "Mountain";
    private static final String NAME_CRAB = "Crab";
    private static final String NAME_FLATWORM = "Flatworm";
    private static final String NAME_ALIEN = "Alien";
    private static final String NAME_SQUIRREL = "Squirrel";
    private static final String NAME_GRAVITY = "Gravity";

    public FirstCreateIntentService(){
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        ElementDBHelper helper = new ElementDBHelper(getApplicationContext());

        Element water = new Element(NAME_WATER, GroupType.DEFAULT, true, null, false);
        Element air = new Element(NAME_AIR, GroupType.DEFAULT, true, null, false);
        Element fire = new Element(NAME_FIRE, GroupType.DEFAULT, true, null, false);
        Element earth = new Element(NAME_EARTH, GroupType.DEFAULT, true, null, false);
        Element steam = new Element(NAME_STEAM, GroupType.WATER_AND_ICE, false, fire, water, false);
        Element dust = new Element(NAME_DUST, GroupType.LIFE, false, air, earth, false);
        Element energy = new Element(NAME_ENERGY, GroupType.OUT_OF_SIGHT, false, fire, air, false);
        Element dirt = new Element(NAME_DIRT, GroupType.LIFE, false, dust, earth, false);
        Element mud = new Element(NAME_MUD, GroupType.LIFE, false, dirt, water, false);
        Element cloud = new Element(NAME_CLOUD, GroupType.WEATHER, false, steam, air, false);
        Element rain = new Element(NAME_RAIN, GroupType.WEATHER, false, water, air, false);
        Element wind = new Element(NAME_WIND, GroupType.WEATHER, false, air, energy, false);
        Element geyser = new Element(NAME_GEYSER, GroupType.GEOLOGICAL_EVENT, false, earth, steam, false);
        ArrayList<Element[]> pressureParents = new ArrayList<>();
        pressureParents.add(new Element[]{air, air});
        pressureParents.add(new Element[]{earth, earth});
        Element pressure = new Element(NAME_PRESSURE, GroupType.OUT_OF_SIGHT, false, pressureParents, false);
        Element sedimentaryRock = new Element(NAME_SEDIMENTARYROCK, GroupType.ROCK, false, earth, pressure, false);
        Element lava = new Element(NAME_LAVA, GroupType.ROCK, false, fire, sedimentaryRock, false);
        Element volcano = new Element(NAME_VOLCANO, GroupType.GEOLOGICAL_EVENT, false, lava, geyser, false);
        Element eruption = new Element(NAME_ERUPTION, GroupType.GEOLOGICAL_EVENT, false, volcano, energy, false);
        Element tropicalStorm = new Element(NAME_TROPICALSTORM, GroupType.WEATHER, false, rain, energy, false);
        Element hurricane = new Element(NAME_HURRICANE, GroupType.WEATHER, false, tropicalStorm, energy, false);
        Element ice = new Element(NAME_ICE, GroupType.WATER_AND_ICE, false, water, pressure, false);
        Element igneousRock = new Element(NAME_IGNEOUSROCK, GroupType.ROCK, false, ice, lava, false);
        ArrayList<Element[]> sandParents = new ArrayList<>();
        sandParents.add(new Element[]{sedimentaryRock, water});
        sandParents.add(new Element[]{igneousRock, water});
        sandParents.add(new Element[]{sedimentaryRock, wind});
        sandParents.add(new Element[]{igneousRock, wind});
        Element sand = new Element(NAME_SAND, GroupType.ROCK, false, sandParents, false);
        Element beach = new Element(NAME_BEACH, GroupType.GEOLOGICAL_EVENT, false, water, sand, false);
        Element glacier = new Element(NAME_GLACIER, GroupType.WATER_AND_ICE, false, ice, earth, false);
        Element iceberg = new Element(NAME_ICEBERG, GroupType.WATER_AND_ICE, false, ice, water, false);
        Element gunpowder = new Element(NAME_GUNPOWDER, GroupType.FIRE, false, fire, dust, false);
        ArrayList<Element[]> metalParents = new ArrayList<>();
        metalParents.add(new Element[]{fire, igneousRock});
        metalParents.add(new Element[]{fire, sedimentaryRock});
        Element metal = new Element(NAME_METAL, GroupType.ROCK, false, metalParents, false);
        Element plant = new Element(NAME_PLANT, GroupType.LIFE, false, dirt, rain, false);
        Element glass = new Element(NAME_GLASS, GroupType.OUT_OF_SIGHT, false, sand, pressure, false);
        ArrayList<Element[]> timeParents = new ArrayList<>();
        timeParents.add(new Element[]{earth, pressure});
        timeParents.add(new Element[]{glass, sand});
        Element time = new Element(NAME_TIME, GroupType.OUT_OF_SIGHT, false, timeParents, false);
        Element tree = new Element(NAME_TREE, GroupType.LIFE, false, plant, time, false);
        ArrayList<Element[]> swampParents = new ArrayList<>();
        swampParents.add(new Element[]{mud, plant});
        swampParents.add(new Element[]{mud, water});
        Element swamp = new Element(NAME_SWAMP, GroupType.LIFE, false, swampParents, false);
        Element explosion = new Element(NAME_EXPLOSION, GroupType.FIRE, false, fire, gunpowder, false);
        Element life = new Element(NAME_LIFE, GroupType.LIFE, false, swamp, energy, false);
        Element human = new Element(NAME_HUMAN, GroupType.HUMANITY, false, life, time, false);
        ArrayList<Element[]> humanParents = new ArrayList<>();
        humanParents.add(new Element[]{life, earth});
        Element tool = new Element(NAME_TOOL, GroupType.HUMANITY, false, human, sedimentaryRock, false);
        ArrayList<Element[]> toolParents = new ArrayList<>();
        toolParents.add(new Element[]{human, igneousRock});
        toolParents.add(new Element[]{human, metal});
        tool.addAllParents(toolParents);
        Element wood = new Element(NAME_WOOD, GroupType.LIFE, false, tool, tree, false);
        Element house = new Element(NAME_HOUSE, GroupType.HUMANITY, false, wood, wood, false);
        Element mansion = new Element(NAME_MANSION, GroupType.HUMANITY, false, house, house, false);
        Element castle = new Element(NAME_CASTLE, GroupType.HUMANITY, false, mansion, mansion, false);
        Element furniture = new Element(NAME_FURNITURE, GroupType.HUMANITY, false, house, tool, false);
        ArrayList<Element[]> furnitureParents = new ArrayList<>();
        furnitureParents.add(new Element[]{mansion, tool});
        furniture.addAllParents(furnitureParents);
        Element throne = new Element(NAME_THRONE, GroupType.HUMANITY, false, castle, tool, false);
        Element treeHouse = new Element(NAME_TREEHOUSE, GroupType.HUMANITY, false, tree, house, false);
        Element king = new Element(NAME_KING, GroupType.HUMANITY, false, human, throne, false);
        ArrayList<Element[]> kingParents = new ArrayList<>();
        kingParents.add(new Element[]{human, castle});
        king.addAllParents(kingParents);
        Element love = new Element(NAME_LOVE, GroupType.OUT_OF_SIGHT, false, human, human, false);
        Element child = new Element(NAME_CHILD, GroupType.HUMANITY, false, love, love, false);
        ArrayList<Element[]> childParents = new ArrayList<>();
        childParents.add(new Element[]{human, human});
        child.addAllParents(childParents);
        humanParents.add(new Element[]{child, time});
        human.addAllParents(humanParents);
        Element babyBreath = new Element(NAME_BABYBREATH, GroupType.LIFE, false, child, plant, false);
        Element paper = new Element(NAME_PAPER, GroupType.HUMANITY, false, wood, tool, false);
        Element wallPaper = new Element(NAME_WALLPAPER, GroupType.HUMANITY, false, paper, house, false);
        Element beachHouse = new Element(NAME_BEACHHOUSE, GroupType.HUMANITY, false, beach, house, false);
        Element rose = new Element(NAME_ROSE, GroupType.LIFE, false, love, life, false);
        Element sky = new Element(NAME_SKY, GroupType.WEATHER, false, cloud, air, false);
        Element star = new Element(NAME_STAR, GroupType.OUTER_SPACE, false, energy, sky, false);
        ArrayList<Element[]> starParents = new ArrayList<>();
        starParents.add(new Element[]{fire, sky});
        star.addAllParents(starParents);
        Element sun = new Element(NAME_SUN, GroupType.OUTER_SPACE, false, star, earth, false);
        Element smoke = new Element(NAME_SMOKE, GroupType.FIRE, false, fire, wood, false);
        Element day = new Element(NAME_DAY, GroupType.DAY_AND_NIGHT, false, sun, earth, false);
        Element moon = new Element(NAME_MOON, GroupType.OUTER_SPACE, false, sky, igneousRock, false);
        ArrayList<Element[]> moonParents = new ArrayList<>();
        moonParents.add(new Element[]{sedimentaryRock, sky});
        moon.addAllParents(moonParents);
        Element night = new Element(NAME_NIGHT, GroupType.DAY_AND_NIGHT, false, moon, earth, false);
        Element earthquake = new Element(NAME_EARTHQUAKE, GroupType.GEOLOGICAL_EVENT, false, earth, energy, false);
        Element mountain = new Element(NAME_MOUNTAIN, GroupType.GEOLOGICAL_EVENT, false, earthquake, earth, false);
        ArrayList<Element[]> mountainParents = new ArrayList<>();
        mountainParents.add(new Element[]{earth, time});
        mountain.addAllParents(mountainParents);
        Element crab = new Element(NAME_CRAB, GroupType.LIFE, false, life, beach, false);
        Element flatworm = new Element(NAME_FLATWORM, GroupType.LIFE, false, paper, life, false);
        Element alien = new Element(NAME_ALIEN, GroupType.OUTER_SPACE, false, star, life, false);
        ArrayList<Element[]> alienParents = new ArrayList<>();
        alienParents.add(new Element[]{moon, life});
        alien.addAllParents(alienParents);
        Element squirrel = new Element(NAME_SQUIRREL, GroupType.LIFE, false, life, tree, false);
        Element gravity = new Element(NAME_GRAVITY, GroupType.OUT_OF_SIGHT, false, earth, energy, false);

        helper.insertElement(water);
        helper.insertElement(air);
        helper.insertElement(fire);
        helper.insertElement(earth);
        helper.insertElement(steam);
        helper.insertElement(dust);
        helper.insertElement(energy);
        helper.insertElement(dirt);
        helper.insertElement(mud);
        helper.insertElement(cloud);
        helper.insertElement(rain);
        helper.insertElement(dust);
        helper.insertElement(wind);
        helper.insertElement(geyser);
        helper.insertElement(pressure);
        helper.insertElement(sedimentaryRock);
        helper.insertElement(lava);
        helper.insertElement(volcano);
        helper.insertElement(eruption);
        helper.insertElement(tropicalStorm);
        helper.insertElement(hurricane);
        helper.insertElement(ice);
        helper.insertElement(igneousRock);
        helper.insertElement(sand);
        helper.insertElement(beach);
        helper.insertElement(glacier);
        helper.insertElement(iceberg);
        helper.insertElement(gunpowder);
        helper.insertElement(metal);
        helper.insertElement(plant);
        helper.insertElement(glass);
        helper.insertElement(time);
        helper.insertElement(tree);
        helper.insertElement(swamp);
        helper.insertElement(explosion);
        helper.insertElement(life);
        helper.insertElement(human);
        helper.insertElement(tool);
        helper.insertElement(wood);
        helper.insertElement(house);
        helper.insertElement(mansion);
        helper.insertElement(castle);
        helper.insertElement(furniture);
        helper.insertElement(throne);
        helper.insertElement(treeHouse);
        helper.insertElement(king);
        helper.insertElement(love);
        helper.insertElement(child);
        helper.insertElement(babyBreath);
        helper.insertElement(paper);
        helper.insertElement(wallPaper);
        helper.insertElement(beachHouse);
        helper.insertElement(rose);
        helper.insertElement(sky);
        helper.insertElement(star);
        helper.insertElement(sun);
        helper.insertElement(smoke);
        helper.insertElement(day);
        helper.insertElement(moon);
        helper.insertElement(night);
        helper.insertElement(mountain);
        helper.insertElement(crab);
        helper.insertElement(flatworm);
        helper.insertElement(alien);
        helper.insertElement(squirrel);
        helper.insertElement(gravity);
        helper.insertElement(earthquake);


        requestBackup();
    }

    public void requestBackup() {
        BackupManager bm = new BackupManager(this);
        bm.dataChanged();
    }
}
