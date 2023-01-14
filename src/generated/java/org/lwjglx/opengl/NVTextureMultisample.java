package org.lwjglx.opengl;

public class NVTextureMultisample {
    public static void glTexImage2DMultisampleCoverageNV(
            int target,
            int coverageSamples,
            int colorSamples,
            int internalFormat,
            int width,
            int height,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTexImage2DMultisampleCoverageNV(
                target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
    }

    public static void glTexImage3DMultisampleCoverageNV(
            int target,
            int coverageSamples,
            int colorSamples,
            int internalFormat,
            int width,
            int height,
            int depth,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTexImage3DMultisampleCoverageNV(
                target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
    }

    public static void glTextureImage2DMultisampleCoverageNV(
            int texture,
            int target,
            int coverageSamples,
            int colorSamples,
            int internalFormat,
            int width,
            int height,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTextureImage2DMultisampleCoverageNV(
                texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
    }

    public static void glTextureImage2DMultisampleNV(
            int texture,
            int target,
            int samples,
            int internalFormat,
            int width,
            int height,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTextureImage2DMultisampleNV(
                texture, target, samples, internalFormat, width, height, fixedSampleLocations);
    }

    public static void glTextureImage3DMultisampleCoverageNV(
            int texture,
            int target,
            int coverageSamples,
            int colorSamples,
            int internalFormat,
            int width,
            int height,
            int depth,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTextureImage3DMultisampleCoverageNV(
                texture,
                target,
                coverageSamples,
                colorSamples,
                internalFormat,
                width,
                height,
                depth,
                fixedSampleLocations);
    }

    public static void glTextureImage3DMultisampleNV(
            int texture,
            int target,
            int samples,
            int internalFormat,
            int width,
            int height,
            int depth,
            boolean fixedSampleLocations) {
        org.lwjgl.opengl.NVTextureMultisample.glTextureImage3DMultisampleNV(
                texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
    }
}