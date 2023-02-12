import java.util.Scanner;

public class procedimental {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        String nombre;
        int id, semestreActual,materia,option;
        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre del estudiante");
        nombre = leer.nextLine();
        System.out.println("Indentificaion del estudiante");
        id = leer.nextInt();



        do{
            System.out.println("Semestre para el cual va a inscribir materias");
            semestreActual = leer.nextInt();
            switch(semestreActual){
                case 1:
                    System.out.println("Escoja la materia la cual quiere inscribir");
                    System.out.println("1. Calculo Diferencial            G01     LUMIVI; 7:00-9:00");
                    System.out.println("2. Calculo Diferencial            G02     LUMIVI; 9:00-11:00");
                    System.out.println("3. Pensamiento Algoritmico        G01     LUMI; 9:00-11:00");
                    System.out.println("4. Pensamiento Algoritmico        G02     LUVI; 9:00-11:00");
                    System.out.println("5. Ciencia Computacional Basica   G01     MAVI; 7:00-9:00");
                    System.out.println("6. Ciencia computacional Basica   G02     MAVI; 9:00-11:00");
                    System.out.println("7. Introduccion a la I.A.         G01     MA; 7:00-9:00");
                    System.out.println("8. Introduccion a la I.A.         G02     JU; 7:00-9:00");
                    materia = leer.nextInt();
                    System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 2:
                    System.out.println("Escoja la materia la cual quiere inscribir");
                    System.out.println("1. Calculo Integral                         G01     LUMIVI; 7:00-9:00" );
                    System.out.println("2. Calculo Integral                         G02     LUMIVI; 9:00-11:00");
                    System.out.println("3. Fundamentos de Diseño de Software        G01     MAJU; 9:00-11:00");
                    System.out.println("4. Fundamentos de Diseño de Software        G02     MAJU; 11:00-13:00");
                    System.out.println("5. Cibernetica y Sistemas Inteligentes      G01     LUMI; 11:00-13:00");
                    System.out.println("6. Cibernetica y Sistemas Inteligentes      G02     LUVI; 9:00-11:00");
                    System.out.println( "7. Fisica Mecanica                         G01     LUMIVI; 9:00-11-00");
                    System.out.println("8. Fisica Mecanica                          G02     LUMAJU; 13:00-15:00");
                    materia = leer.nextInt();
                    System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 3:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Modelacion Matematica            G01     LUMIVI; 11:00-13:00");
                System.out.println("2. Modelacion matematica            G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Fisica Electromagnetica          G01     LUMAJU; 15:00-17:00");
                System.out.println("4. Fisica Electromagnetica          G02     LUMIVI; 13:00-15:00");
                System.out.println("5. Paradigmas de Programacion       G01     LUVI; 9:00-11:00");
                System.out.println("6. Paradigmas de programacion       G02     LUVI; 11:00-13:00");
                System.out.println("7. Estructura de datos lineales     G01     MAJU 9:00-11:00");
                System.out.println("8. Estructura de datos lineales     G02     MAJU; 11:00-13:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 4:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Estructura de Datos no Lineales          G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Estructura de datos no lineales          G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Analisis de Algoritmos                   G01     LUMI; 9:00-11:00");
                System.out.println("4. Analisis de Algoritmos                   G02     LUVI; 9:00-11:00");
                System.out.println("5. Redes de Computacion                     G01     MAVI; 7:00-9:00");
                System.out.println("6. Redes de Computacion                     G02     MAVI; 9:00-11:00");
                System.out.println("7. Ciencia Computacional Intermedia         G01     MA; 7:00-9:00");
                System.out.println("8. Ciencia Computacional Intermedia         G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 5:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Bases de Datos                               G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Bases de Datos                               G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Lenguajes de Programacion y Transduccion     G01     LUMI; 9:00-11:00");
                System.out.println("4. Lenguajes de Programacion y Transduccion     G02     LUVI; 9:00-11:00");
                System.out.println("5. Sistemas Operativos                          G01     MAVI; 7:00-9:00");
                System.out.println( "6. Sistemas Operativos                          G02     MAVI; 9:00-11:00");
                System.out.println("7. Ciencia Computacional Avanzada               G01     MA; 7:00-9:00");
                System.out.println("8. Ciencia Computacional Avanzada               G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 6:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println( "1. Ingenieria de Software                G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Ingenieria de Software                G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Patrones de Diseño de Software        G01     LUMI; 9:00-11:00");
                System.out.println("4. Patrones de Diseño de Software        G02     LUVI; 9:00-11:00");
                System.out.println("5. Computacion Paralela y Distribuida    G01     MAVI; 7:00-9:00");
                System.out.println("6. Computacion Paralela y Distribuida    G02     MAVI; 9:00-11:00");
                System.out.println("7. Inteligencia Artificial               G01     MA; 7:00-9:00");
                System.out.println("8. Inteligencia Artificial               G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 7:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Arquitectura de Software             G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Arquitectura de Software             G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Big Data e Ingenieria de Datos       G01     LUMI; 9:00-11:00");
                System.out.println("4. Big Data e Ingenieria de Datos       G02     LUVI; 9:00-11:00");
                System.out.println("5. Seguridad de la Informatica          G01     MAVI; 7:00-9:00");
                System.out.println("6. Seguridad de la Informatica          G02     MAVI; 9:00-11:00");
                System.out.println("7. Aprendizaje de la Maquina            G01     MA; 7:00-9:00");
                System.out.println("8. Aprendizaje de la Maquina            G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 8:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Diseño Creativo        G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Diseño Creativo        G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Electiva I             G01     LUMI; 9:00-11:00");
                System.out.println("4. Electiva I             G02     LUVI; 9:00-11:00");
                System.out.println("5. Electiva II            G01     MAVI; 7:00-9:00");
                System.out.println("6. Electiva II            G02     MAVI; 9:00-11:00");
                System.out.println("7. Optativa V             G01     MA; 7:00-9:00");
                System.out.println("8. Optativa V             G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
                case 9:
                System.out.println("Escoja la materia la cual quiere inscribir");
                System.out.println("1. Electiva IV           G01     LUMIVI; 7:00-9:00");
                System.out.println("2. Electiva IV           G02     LUMIVI; 9:00-11:00");
                System.out.println("3. Electiva V            G01     LUMI; 9:00-11:00");
                System.out.println("4. Electiva V            G02     LUVI; 9:00-11:00");
                System.out.println("5. Opcion de Grado       G01     MAVI; 7:00-9:00");
                System.out.println("6. Opcion de Grado       G02     MAVI; 9:00-11:00");
                System.out.println("7. Optativa VI           G01     MA; 7:00-9:00");
                System.out.println("8. Optativa VI           G02     JU; 7:00-9:00");
                materia = leer.nextInt();
                System.out.println("materia:"+materia+"semestre"+semestreActual);
                break;
            } 
            
            System.out.println("Desea inscribir otra materia");
            System.out.println("1. si");
            System.out.println("2. no");
            option = leer.nextInt();

        }while(option == 2);

        leer.close();
        System.out.println("porfavor " + nombre +" "+id+ " revise las materias que inscribio segun el numero de indice");
    }
}
