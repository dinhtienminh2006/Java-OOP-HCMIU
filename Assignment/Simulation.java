/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */

public class Simulation{
    private Box box;

    public Simulation(int width, int height){
        this.box = Box.getInstance(width, height);

        for (int i = 0; i < 3; i++){
            box.addingParticleBox();
        }
    }

    public void particleMoving(){
        for (Particle p : box.getParticles()){
            p.movingParticle(box.getWidth(), box.getHeight());
        }

        box.checkingCollision();
        System.out.println("Number of particles: " + box.getParticles().size());
        drawing();
    }

    public void drawing() {
        for (int i = 0; i < box.getWidth() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int y = 0; y <= box.getHeight(); y++) {
            System.out.print("|");

            for (int x = 0; x <= box.getWidth(); x++) {
                boolean checkingParticle = false;
                for (Particle p : box.getParticles()) {
                    if (p.getX() == x && p.getY() == y) {
                        checkingParticle = true;
                        break;
                    }
                }

                if (checkingParticle == false) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("|");
        }

        for (int i = 0; i < box.getWidth() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Simulation s = new Simulation(20, 5);
        s.drawing();

        int steps = 5;
        for (int i = 0; i < steps; i++) {
            s.particleMoving();
        }
    }
}
    
