
public class forward {

    public static void main(String[] args) {

        double a11 = 0.2;
        double a12 = 0.8;
        double a21 = 0.6;
        double a22 = 0.4;

        double BPH1 = 0.7;
        double BPH2 = 0.4;
        double BPT1 = 0.3;
        double BPT2 = 0.6;

        double pi1 = 1.0;
        double pi2 = 0.0;

        double B1O1 = 0.3;
        double B2O1 = 0.6;

        double sigma1 = B1O1 * pi1;
        double sigma2 = B2O1 * pi2;

        String[] Obv = {"T", "H", "T"};


        if ( Obv[1].equals("T") ) {

            double tails1 = (((sigma1 * a11) + (sigma2 * a21)) * BPT1);
            double tails2 = (((sigma1 * a12) + (sigma2 * a22)) * BPT2);
            double x = tails1;
            double y = tails2;

            if (Obv[2].equals("H")) {
                double h3 = (((x * a11) + (y * a21)) * BPH1);
                double h4 = (((x * a12) + (y * a22)) * BPH2);
                double z = h3;
                double w = h4;
                double P = z + w;
                System.out.println("P(Obv|Lambda) = " + P);

            } else if (Obv[2].equals("T")) {
                double tails3 = (((x * a11) + (y * a21)) * BPT1);
                double tails4 = (((x * a12) + (y * a22)) * BPT2);
                double z = tails3;
                double w = tails4;
                double P = z + w;
                System.out.println("P(Obv|Lambda) = " + P);
            }
        }

        if (Obv[1].equals("H")) { {

            double h1 = (((sigma1 * a11) + (sigma2 * a21)) * BPH1);
            double h2 = (((sigma1 * a12) + (sigma2 * a22)) * BPH2);
            double x = h1;
            double y = h2;

            if (Obv[2].equals("H")) {
                double h3 = (((x * a11) + (y * a21)) * BPH1);
                double h4 = (((x * a12) + (y * a22)) * BPH2);
                double z = h3;
                double w = h4;
                double P = z + w;
                System.out.println("P(Obv|Lambda) = " + P);

            } else if (Obv[2].equals("T")) {
                double tails3 = (((x * a11) + (y * a21)) * BPT1);
                double tails4 = (((x * a12) + (y * a22)) * BPT2);
                double z = tails3;
                double w = tails4;
                double P = z + w;
                System.out.println("P(Obv|Lambda) = " + P);
            }
        }
        }
    }
}
