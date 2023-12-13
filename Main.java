import java.util.*;
public class Main {
    public static void main(String[] args) {

    ArrayList list=new ArrayList();

    list.add("test");
    list.add(5);
    list.add("1Alinfo7");
    list.add(7.2);
    list.add("test");
    list.add("abc");
    list.add("1Alinfo7");

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(5));
        System.out.println(list.contains("test"));
        System.out.println(list.get(2));
        System.out.println(list.remove(5));
        Integer a=5;
        System.out.println(list.remove(a));
        System.out.println(list);
Personne p1=new Personne(1,"nom1","prenom1");
        Personne p2=new Personne(2,"nom2","prenom2");
        Personne p3=new Personne(3,"nom3","prenom3");

        Personne p4=new Personne(3,"nom3","prenom3");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);
        for (int i=0;i<list.size();i++)
        {
            Object o=list.get(i);
            System.out.println(o);
        }
        for (int i=0;i<list.size();i++)
        { if(list.get(i) instanceof Personne)
        {
            System.out.println(((Personne) list.get(i)).getNom());
        }
        }
        ArrayList<Personne> lisp=new ArrayList<>();
        lisp.add(p1);
        lisp.add(p2);
        lisp.add(p3);
      //  Object ob=list.get(1);
        //Personne per=(Personne)list.get(6);
         Personne per1=lisp.get(0);

        System.out.println(lisp.contains(p1));
        System.out.println(lisp.contains(new Personne(2,"nom2","prenom2")));
        System.out.println(lisp.contains(p4));
        System.out.println(lisp.remove(p4));
        System.out.println(lisp);

        //Tri List integer croissant et decroissant
        ArrayList<Integer> lisi=new ArrayList<>();
        lisi.add(12);
        lisi.add(5);
        lisi.add(13);
        System.out.println("Avant tri"+lisi);
        Collections.sort(lisi);
        System.out.println("Apreès tri croi"+lisi);
        Collections.sort(lisi,Collections.reverseOrder());
        System.out.println("Apreès tri dec"+lisi);
        //Tri List String  croissant et decroissant
        ArrayList<String> liss=new ArrayList<>();
        liss.add("tes");
        liss.add("abc");
        liss.add("Abc");
        System.out.println("Avant tri"+liss);
        Collections.sort(liss);
        System.out.println("Apreès tri croi"+liss);
        Collections.sort(liss,Collections.reverseOrder());
        System.out.println("Apreès tri dec"+liss);

        //Tri id List personne  croissant et decroissant
        //Collections.sort(lisp);
       //Tri nom List personne  croissant et decroissant
        
        Collections.sort(lisp, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p1.getNom().compareTo(p2.getNom());
            }
        });
        System.out.println("La liste croissante des personnes triée par nom: " + lisp);

        Collections.sort(lisp, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p2.getNom().compareTo(p1.getNom());
            }
        });
        System.out.println("La liste des personnes décroissante triée par nom: " + lisp);

    }
}