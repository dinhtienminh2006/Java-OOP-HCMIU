package OOPLAB3;
import java.util.ArrayList;
import java.util.Random;

public class Box {
    private int width;
    private int height;
    private ArrayList<Particle> particles;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        this.particles = new ArrayList<>();
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList<Particle> getParticles() {
        return particles;
    }

    public void addingParticleBox() {
        Random rand = new Random();
        int x_random = rand.nextInt(this.width + 1);
        int y_random = rand.nextInt(this.height + 1);
        this.particles.add(new Particle(x_random, y_random));
    }

    public void checkingCollision(){
        int checking_counting = 0;

        for (int i = 0; i<this.particles.size(); i++){
            for (int j = i + 1; j<this.particles.size(); j++){
                Particle checking_particle = this.particles.get(i);
                Particle checking_particle_2 = this.particles.get(j);
                if (checking_particle.getX() == checking_particle_2.getX() && checking_particle.getY() == checking_particle_2.getY()){
                    System.out.println("Collision at" + checking_particle.getX() + " " + checking_particle.getY());
                    checking_counting++;
                }
            }
        }
        for (int i = 0; i < checking_counting; i++){
            addingParticleBox();
        }
    }


}
