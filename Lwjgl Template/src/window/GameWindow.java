package window;
import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.system.MemoryUtil.NULL;

import org.lwjgl.opengl.*;


public class GameWindow {
private long window;

    public void run(){
        Init();
        loop();
        freeresources();
        }
        
        
        void Init() {

            glfwInit();
            window = glfwCreateWindow(500, 500, "First window first first", NULL, NULL);
            glfwMakeContextCurrent(window);
            GL.createCapabilities();

        }

        void loop(){
            while (!glfwWindowShouldClose(window)) {
                glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
                glfwSwapBuffers(window);
                glfwPollEvents();                
            }
        }

        void freeresources(){
            glfwFreeCallbacks(window);
            glfwDestroyWindow(window);
            glfwTerminate();
        }


}
