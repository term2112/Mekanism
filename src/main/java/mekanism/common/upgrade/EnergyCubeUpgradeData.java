package mekanism.common.upgrade;

import java.util.List;
import mekanism.common.base.IRedstoneControl.RedstoneControl;
import mekanism.common.base.ITileComponent;
import mekanism.common.inventory.slot.EnergyInventorySlot;
import net.minecraft.nbt.CompoundNBT;

public class EnergyCubeUpgradeData implements IUpgradeData {

    public final boolean redstone;
    public final RedstoneControl controlType;
    public final double electricityStored;
    public final EnergyInventorySlot chargeSlot;
    public final EnergyInventorySlot dischargeSlot;
    public final CompoundNBT components;

    public EnergyCubeUpgradeData(boolean redstone, RedstoneControl controlType, double electricityStored, EnergyInventorySlot chargeSlot, EnergyInventorySlot dischargeSlot,
          List<ITileComponent> components) {
        this.redstone = redstone;
        this.controlType = controlType;
        this.electricityStored = electricityStored;
        this.chargeSlot = chargeSlot;
        this.dischargeSlot = dischargeSlot;
        this.components = new CompoundNBT();
        for (ITileComponent component : components) {
            component.write(this.components);
        }
    }
}