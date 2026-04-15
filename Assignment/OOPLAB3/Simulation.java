package OOPLAB3;

public class Simulation{
    private Box box;

    public Simulation(int width, int height){
        this.box = new Box(width, height);

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
