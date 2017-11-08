public class GGT {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]), n = Integer.parseInt(args[1]);

    //exit if n or m < 0
    if(m < 0 || n < 0) {
      System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
      System.exit(-1);
    }

    int r = 1; //init r != 0
    //swap if m<n
    int swap;
    while (r != 0) {
      if(m<n) {
        swap = m;
        m = n;
        n = swap;
      }
      r = m-n;
      m = n;
      n = r;
      if(r != 0) {
      }
      else {
        System.out.println("ggT(" + args[0] + ", " + args[1] + ") = " + m);
        break;
      }
    }
  }
}
