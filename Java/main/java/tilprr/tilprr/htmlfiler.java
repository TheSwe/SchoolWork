package tilprr.tilprr;

public class htmlfiler {
    public static void main(String[] args) {
        
        String[] files = {"beautybox.jpg","biobags.jpg","doftljuskonstverk.jpg","headsup.png","lucida.jpg","lyckotassar.png","mothlightapparel.jpg","satine.jpg","wakehvirkning.jpg","pure.jpg"};
        String[] alts = {"Beautybox UF","Biobags UF","Doftljus Konstverk UF","Heads Up UF","Lucida UF","Lyckotassar UF","Mothlight Apparel UF","Satine UF","WAKEH Virkning UF","pure.jpg"};
        String[] foretag = {"beautybox","biobags","doftljuskonstverk","headsup","lucida","lyckotassar","mothlightapparel","satine","wakehvirkning","pure"};

        for (int i = 0; i<9;i++){
            System.out.println("<li class=\"hex\">");
            System.out.println("  <div class=\"hexIn\">");
            System.out.println("    <a class=\"hexLink\" href=\"#\">");
            System.out.println("      <div class='hex-img' id='foretag-"+foretag[i]+"'></div>");
            System.out.println("      <h1 id=\"demo1\">"+alts[i]+"</h1>");
            System.out.println("    </a>");
            System.out.println("  </div>");
            System.out.println("</li>");
        }
    }
}
