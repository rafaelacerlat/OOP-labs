package com.rc.Lab8;

public class GeometricBodyController {
    static double getBiggestSurface(GeometricBody[] gBodies) {
        double biggestSurface = 0;
        for (GeometricBody gBody : gBodies) {
            if (gBody.getSurface() > biggestSurface) {
                biggestSurface = gBody.getSurface();
            }
        }
        return biggestSurface;
    }

    static double getBiggestVolume(GeometricBody[] gBodies) {
        double biggestVolume = 0;
        for (GeometricBody gBody : gBodies) {
            if (gBody.getVolume() > biggestVolume) {
                biggestVolume = gBody.getVolume();
            }
        }
        return biggestVolume;
    }
}
