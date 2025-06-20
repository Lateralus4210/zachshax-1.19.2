package quest.remember;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
// import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.glfw.GLFW;

// public class ClientInputHandler {
// private static boolean wasClicking = false; // debounce latch

// public static void init() {
// ClientTickEvents.END_CLIENT_TICK.register(client -> {
// if (client.player == null || client.crosshairTarget == null)
// return;

// long window = client.getWindow().getHandle();

// boolean leftClick = GLFW.glfwGetMouseButton(window,
// GLFW.GLFW_MOUSE_BUTTON_LEFT) == GLFW.GLFW_PRESS;
// boolean ctrlDown = InputUtil.isKeyPressed(window,
// GLFW.GLFW_KEY_LEFT_CONTROL);

// if (leftClick && ctrlDown && !wasClicking) {
// wasClicking = true;

// ZachsHax.LOGGER.info("Tick: player={}, target={}, LMB={}, Ctrl={}",
// client.player.getName().getString(),
// client.crosshairTarget != null ? client.crosshairTarget.getType().toString()
// : "null",
// InputUtil.isKeyPressed(client.getWindow().getHandle(), 0x01),
// InputUtil.isKeyPressed(client.getWindow().getHandle(), 341));

// ItemStack stack = client.player.getMainHandStack();
// if (stack.getItem() == ZachsHax.KILL_EM_ALL && client.crosshairTarget
// instanceof BlockHitResult hit) {
// BlockPos pos = hit.getBlockPos();
// BlockState state = client.world.getBlockState(pos);
// if (state.getBlock() instanceof StairsBlock) {
// ZachsHax.LOGGER.info("Ctrl+LMB stairs detected at " + pos);
// // TODO: send packet to server here
// }
// }
// }

// if (!leftClick)
// wasClicking = false;
// });

// }
// }
