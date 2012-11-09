package com.improvization.glimprovization.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created with IntelliJ IDEA.
 * User: konstantinshilovskiy
 * Date: 11/9/12
 */
public class ImpGLSurfaceView extends GLSurfaceView {
    public ImpGLSurfaceView(Context context){
        super(context);

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(new ImpGL20Renderer());

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
