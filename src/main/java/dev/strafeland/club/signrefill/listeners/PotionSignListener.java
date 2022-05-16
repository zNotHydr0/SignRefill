package dev.strafeland.club.signrefill.listeners;

import dev.strafeland.club.signrefill.Main;
import dev.strafeland.club.signrefill.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PotionSignListener implements Listener {

    private Main plugin = (Main)Main.getPlugin(Main.class);

    private String[] lines = new String[] { CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-1")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-2")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-3")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-4")) };

    private String[] error = new String[] { CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-1")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-2")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-3")), CC.translate(this.plugin.getConfig().getString("POTS-SIGN-LINE-4")) };

    public PotionSignListener(Main plugin) {}

    public Inventory openMainInventory(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, this.plugin.getConfig().getString("POTS-SIGN-INVENTORY-TITLE"));
        inv.setItem(1, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(2, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(3, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(4, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(5, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(6, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(7, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(8, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(9, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(10, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(11, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(12, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(13, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(14, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(15, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(16, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(17, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(18, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(19, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(20, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(21, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(22, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(23, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(24, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(25, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(26, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(27, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(28, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(29, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(30, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(31, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(32, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(33, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(34, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(35, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(36, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(37, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(38, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(39, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(40, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(41, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(42, new ItemStack(Material.POTION, 1, (short)8259));
        inv.setItem(43, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(44, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(45, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(46, new ItemStack(Material.POTION, 1, (short)8226));
        inv.setItem(47, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(48, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(49, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(50, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(51, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(52, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(53, new ItemStack(Material.POTION, 1, (short)16421));
        inv.setItem(54, new ItemStack(Material.POTION, 1, (short)16421));
        ItemStack goldsword = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemStack healpot = new ItemStack(Material.POTION, 1, (short)16421);
        int in1;
        for (in1 = 0; in1 < 9; in1++)
            inv.setItem(in1, healpot);
        for (in1 = 9; in1 < 18; in1++)
            inv.setItem(in1, healpot);
        for (in1 = 19; in1 < 29; in1++)
            inv.setItem(in1, healpot);
        for (in1 = 30; in1 < 36; in1++)
            inv.setItem(in1, healpot);
        for (in1 = 45; in1 < 54; in1++)
            inv.setItem(in1, goldsword);
        player.openInventory(inv);
        return inv;
    }

    @EventHandler
    public void onSignPlace(SignChangeEvent event) {
        if (event.getLine(0).equals("[Pots]")) {
            Player player = event.getPlayer();
            if (player.hasPermission(this.plugin.getConfig().getString("AUTO-CREATE-SIGN-PERMISSION"))) {
                for (int i = 0; i < this.lines.length; i++)
                    event.setLine(i, this.lines[i]);
            } else {
                for (int i = 0; i < this.error.length; i++)
                    event.setLine(i, this.error[i]);
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        if ((event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_BLOCK) && block.getState() instanceof Sign) {
            Sign sign = (Sign)block.getState();
            for (int i = 0; i < this.lines.length; i++) {
                if (!sign.getLine(i).equals(this.lines[i]))
                    return;
            }
            openMainInventory(player);
        }
    }
}