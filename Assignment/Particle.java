/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */

import java.util.Random;

public class Particle{
    private int x;
    private int y;

    public Particle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public enum Direction {
        NORTH, EAST, SOUTH ,WEST,
        NORTH_EAST, SOUTH_EAST, NORTH_WEST, SOUTH_WEST
    }

    public void movingParticle(int boxWidth, int boxHeight) {
        Direction[] direct = Direction.values();
        Direction randomDirect = direct[new Random().nextInt(direct.length)];

        int x_temp = x;
        int y_temp = y;

        if (randomDirect == Direction.NORTH) {
            y_temp--;
        } else if (randomDirect == Direction.NORTH_EAST) {
            x_temp++;
            y_temp--;
        } else if (randomDirect == Direction.EAST) {
            x_temp++;
        } else if (randomDirect == Direction.SOUTH_EAST) {
            x_temp++;
            y_temp++;
        } else if (randomDirect == Direction.SOUTH) {
            y_temp++;
        } else if (randomDirect == Direction.SOUTH_WEST) {
            x_temp--;
            y_temp++;
        } else if (randomDirect == Direction.WEST) {
            x_temp--;
        } else if (randomDirect == Direction.NORTH_WEST) {
            x_temp--;
            y_temp--;
        }

        if (x_temp >= 0 && y_temp >= 0 && x_temp <= boxWidth && y_temp <= boxHeight) {
            this.x = x_temp;
            this.y = y_temp;
        }
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
