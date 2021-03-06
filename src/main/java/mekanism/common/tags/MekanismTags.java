package mekanism.common.tags;

import mekanism.api.gas.Gas;
import mekanism.api.gas.GasTags;
import mekanism.common.Mekanism;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

//TODO: Put Tag Wrappers used throughout in this class
//TODO: Should this be moved to the API package, Especially if the tag files don't need to exist for these to be valid
public class MekanismTags {

    //TODO: Add a tag for glowstone blocks and clay blocks??
    //TODO: Evaluate the bio fuel recipes, and maybe add sweet berry bush/coral to it (and maybe bamboo sapling). Also add missing flowers that don't get
    // caught by the small flowers tag

    //TODO: Make electrolytic separator recipes actually scale with the config value energy in case From H2 changes

    public static final Tag<Item> DUSTS_BRONZE = makeForgeItemTag("dusts/bronze");
    public static final Tag<Item> DUSTS_CHARCOAL = makeForgeItemTag("dusts/charcoal");
    public static final Tag<Item> DUSTS_COAL = makeForgeItemTag("dusts/coal");
    public static final Tag<Item> DUSTS_COPPER = makeForgeItemTag("dusts/copper");
    public static final Tag<Item> DUSTS_DIAMOND = makeForgeItemTag("dusts/diamond");
    public static final Tag<Item> DUSTS_EMERALD = makeForgeItemTag("dusts/emerald");
    public static final Tag<Item> DUSTS_GOLD = makeForgeItemTag("dusts/gold");
    public static final Tag<Item> DUSTS_IRON = makeForgeItemTag("dusts/iron");
    public static final Tag<Item> DUSTS_LAPIS_LAZULI = makeForgeItemTag("dusts/lapis_lazuli");
    public static final Tag<Item> DUSTS_LITHIUM = makeForgeItemTag("dusts/lithium");
    public static final Tag<Item> DUSTS_OBSIDIAN = makeForgeItemTag("dusts/obsidian");
    public static final Tag<Item> DUSTS_OSMIUM = makeForgeItemTag("dusts/osmium");
    public static final Tag<Item> DUSTS_QUARTZ = makeForgeItemTag("dusts/quartz");
    public static final Tag<Item> DUSTS_REFINED_OBSIDIAN = makeForgeItemTag("dusts/refined_obsidian");
    public static final Tag<Item> DUSTS_SALT = makeForgeItemTag("dusts/salt");
    public static final Tag<Item> DUSTS_STEEL = makeForgeItemTag("dusts/steel");
    public static final Tag<Item> DUSTS_SULFUR = makeForgeItemTag("dusts/sulfur");
    public static final Tag<Item> DUSTS_TIN = makeForgeItemTag("dusts/tin");
    public static final Tag<Item> DUSTS_WOOD = makeForgeItemTag("dusts/wood");

    public static final Tag<Item> INGOTS_BRONZE = makeForgeItemTag("ingots/bronze");
    public static final Tag<Item> INGOTS_COPPER = makeForgeItemTag("ingots/copper");
    public static final Tag<Item> INGOTS_OSMIUM = makeForgeItemTag("ingots/osmium");
    public static final Tag<Item> INGOTS_REFINED_GLOWSTONE = makeForgeItemTag("ingots/refined_glowstone");
    public static final Tag<Item> INGOTS_REFINED_OBSIDIAN = makeForgeItemTag("ingots/refined_obsidian");
    public static final Tag<Item> INGOTS_STEEL = makeForgeItemTag("ingots/steel");
    public static final Tag<Item> INGOTS_TIN = makeForgeItemTag("ingots/tin");

    public static final Tag<Item> ORES_COPPER = makeForgeItemTag("ores/copper");
    public static final Tag<Item> ORES_OSMIUM = makeForgeItemTag("ores/osmium");
    public static final Tag<Item> ORES_TIN = makeForgeItemTag("ores/tin");

    public static final Tag<Item> STORAGE_BLOCKS_OSMIUM = makeForgeItemTag("storage_blocks/osmium");
    public static final Tag<Item> STORAGE_BLOCKS_CHARCOAL = makeForgeItemTag("storage_blocks/charcoal");

    //TODO: Data generators
    public static final Tag<Item> ALLOYS_BASIC = makeItemTag("alloys/basic");
    public static final Tag<Item> ALLOYS_INFUSED = makeItemTag("alloys/infused");
    public static final Tag<Item> ALLOYS_REINFORCED = makeItemTag("alloys/reinforced");
    public static final Tag<Item> ALLOYS_ATOMIC = makeItemTag("alloys/atomic");

    public static final Tag<Item> ENRICHED_CARBON = makeItemTag("enriched/carbon");
    public static final Tag<Item> ENRICHED_DIAMOND = makeItemTag("enriched/diamond");
    public static final Tag<Item> ENRICHED_OBSIDIAN = makeItemTag("enriched/obsidian");
    public static final Tag<Item> ENRICHED_REDSTONE = makeItemTag("enriched/redstone");

    public static final Tag<Item> CLUMPS_COPPER = makeItemTag("clumps/copper");
    public static final Tag<Item> CLUMPS_GOLD = makeItemTag("clumps/gold");
    public static final Tag<Item> CLUMPS_IRON = makeItemTag("clumps/iron");
    public static final Tag<Item> CLUMPS_OSMIUM = makeItemTag("clumps/osmium");
    public static final Tag<Item> CLUMPS_TIN = makeItemTag("clumps/tin");

    public static final Tag<Item> CRYSTALS_COPPER = makeItemTag("crystals/copper");
    public static final Tag<Item> CRYSTALS_GOLD = makeItemTag("crystals/gold");
    public static final Tag<Item> CRYSTALS_IRON = makeItemTag("crystals/iron");
    public static final Tag<Item> CRYSTALS_OSMIUM = makeItemTag("crystals/osmium");
    public static final Tag<Item> CRYSTALS_TIN = makeItemTag("crystals/tin");

    public static final Tag<Item> DIRTY_DUSTS_COPPER = makeItemTag("dirty_dusts/copper");
    public static final Tag<Item> DIRTY_DUSTS_GOLD = makeItemTag("dirty_dusts/gold");
    public static final Tag<Item> DIRTY_DUSTS_IRON = makeItemTag("dirty_dusts/iron");
    public static final Tag<Item> DIRTY_DUSTS_OSMIUM = makeItemTag("dirty_dusts/osmium");
    public static final Tag<Item> DIRTY_DUSTS_TIN = makeItemTag("dirty_dusts/tin");

    public static final Tag<Item> SHARDS_COPPER = makeItemTag("shards/copper");
    public static final Tag<Item> SHARDS_GOLD = makeItemTag("shards/gold");
    public static final Tag<Item> SHARDS_IRON = makeItemTag("shards/iron");
    public static final Tag<Item> SHARDS_OSMIUM = makeItemTag("shards/osmium");
    public static final Tag<Item> SHARDS_TIN = makeItemTag("shards/tin");

    private static Tag<Item> makeForgeItemTag(String name) {
        return new ItemTags.Wrapper(new ResourceLocation("forge", name));
    }

    private static Tag<Item> makeItemTag(String name) {
        return new ItemTags.Wrapper(Mekanism.rl(name));
    }

    public static final Tag<Gas> DIRTY_SLURRY = makeGasTag("dirty_slurry");
    public static final Tag<Gas> CLEAN_SLURRY = makeGasTag("clean_slurry");

    private static Tag<Gas> makeGasTag(String name) {
        return new GasTags.Wrapper(Mekanism.rl(name));
    }
}