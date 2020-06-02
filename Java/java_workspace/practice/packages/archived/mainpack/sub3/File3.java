package packages.archived.mainpack.sub3;
import packages.archived.mainpack.sub1.File1;
import packages.archived.mainpack.sub1.File2;

class File3
{
    public static void main(String[] args) {
        System.out.println("File3");
        File1.main(null);
        File2.main(null);
        File1.show();
        File2.show();
    }
}