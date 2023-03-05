import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class stroki {
    public static void main(String[] args) {

        //2
        /* System.out.println("Задайте размер массива");
        Scanner input=new Scanner(System.in);
        int N= input.nextInt();
        int[] array =new int[N];
        int min=0;
        int max=0;
        int sum=0;
        for (int x=array.length-1;x>=0;x--){
            array[x]= (int) (Math.random()*100%10);
        }

       for (int x=array.length-1;x>=0;x--){
           if (array[x]>max){
             max=array[x];
           }
           if (array[x]<min){
               min=array[x];
           }
        }
        System.out.print("Все нечетные значения:");

        for (int x=array.length-1;x>=0;x--){
            sum=sum+array[x];
            if (array[x]%2==1) {
                System.out.print(array[x]);
            }
        }

        System.out.println("\n"+max+"-Максимум");
        double arf= (double)sum/N;
        System.out.println(min+"-минимум"+"\n"+sum+"-сумма всех чисел ");
        System.out.println(arf+"- Среднее арифметическое");

//3
        System.out.println("Введите строку");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int leh=str.length();
        char n='a';
        int koln=0;
        char[] strchar=str.toCharArray();
        for (int x=0;x<str.length();x++){
            if(Character.compare(strchar[x],n)==0){
                koln=koln+1;
            }
        }
        double atf=(double) 100/str.length()*koln;
        System.out.println(atf+"- Процент вхождения символа 'а' в строке");

//4
        int N=5;
        int[][] arr=new int[N][N];
        int sums=0,prst=1,maxd=0;
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                arr[x][y] = (int) (Math.random() * 100 % 10);
            }
        }
        System.out.println("Ниже сама таблица для визуализации");
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                sums=sums+arr[x][y];
            }
            System.out.println(sums+" сумма "+(x+1)+" строки");
            sums=0;
        }
        for (int y=0;y<N;y++){
            for (int x=0;x<N;x++) {
                prst=prst*arr[x][y];
                if ((x==y)&&(arr[x][y]>maxd)){
                    maxd=arr[x][y];
                }
            }
            System.out.println(prst+" произведение чисел "+(y+1)+ " столбца");
            prst=1;
        }
        System.out.println(maxd+" - максимальное число главной диагонали");

//5
        System.out.println("Введите строку через пробел");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char n=' ';
        int kol=1;
        char[] strchar=str.toCharArray();
        for (int x=0;x<str.length();x++){
            if(strchar[x]==' '){
                kol=kol+1;
            }
        }
        System.out.println("Вы ввели "+kol+" слов");

//6


int[] chi=new int[15] ;
int clenght=0;
int nlenght=0;
        for(int x=0;x< chi.length;x++){//генерация случайного массива
            chi[x]=(int)(Math.random()*100);
            System.out.print(chi[x]+" ");
        }
        System.out.println("- случайный массив с числами от 0 до 99" );
        for(int x=0;x< chi.length;x++){//проверяем сколько будет весить
            if(chi[x]%2==1){
                nlenght=nlenght+1;
            }
            else {
                clenght=clenght+1;
            }
        }
int[] chet=new int[clenght];
int[] nechet=new int[nlenght];
        clenght=0;//это чтобы переменные не вводить
        nlenght=0;
        for(int x=0;x<chi.length;x++){//инициализация
            if(chi[x]%2==1){
                nechet[nlenght]=chi[x];
                nlenght=nlenght+1;
            }
            else {
                chet[clenght]=chi[x];
                clenght=clenght+1;
            }
        }
        Arrays.sort(chet);// метод сортировки от меньшего к большему
        Arrays.sort(nechet);
        for(int x=0;x<clenght;x++){
            System.out.print(chet[x]+" ");
        }
        System.out.println("-четный массив по возрастанию ");
        for(int x=0;x<nlenght;x++){
            System.out.print(nechet[x]+" ");
        }
        chet.reverse()
        System.out.println("- нечетный массив по возрастанию ");

//8
         /*int[] M =new int[100];
        int kol=0;
        for (int x=1;x<M.length;x++){
          M[x]=(int)(Math.random()*100);//сл. массив
        }
        for (int x=0;x<M.length;x++){
            if((M[x]>0) && (M[x]<25)){//условие
                kol=kol+1;
            }
        }
        System.out.println(kol+" элементов");
//9
        System.out.println("Введите строку");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int s=0;//s для проверки палиндром или нет
        int m;//м для удобства , чтобы текса меньше
        int y=0;//счетчик спереди
        int i=0;//счетчик сзади
        char[] strchar=str.toCharArray();
        int v=strchar.length-1;//для удобства
        for (int x=0;x<str.length()/2+1;x++){
            if (strchar[v-i]==' '){
                i=i+1;
            }
            if (strchar[y]==' '){
                y=y+1;
            }
            m=Character.compare(strchar[v-i],strchar[y]);
            if((m==0)||(m==32)||(m==-32)){//32 потому что если разный регистр то 32 получается
                s=s+1;
            }else {
                s=-1000;
            }
            y++;
            i++;
        }
        if (s>0){
            System.out.println("Это палиндром");
        }else{
            System.out.println("Это не палиндром");
        }

//10
        int N=5;
        int[][] arr=new int[N][N];
        int sump=0,sumot=1;
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                arr[x][y] = (int) ((Math.random() * 200-100) % 10);
            }
        }
        System.out.println("Ниже сама таблица для визуализации");
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
        System.out.print("Координаты нулей (столбик)(строка):");
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++) {
                if (arr[x][y]==0){
                    System.out.print("("+(y+1)+")("+(x+1)+"),");
                }
                if (arr[x][y]<0){
                    sumot=sumot+1;
                }else{if (arr[x][y]!=0){
                    sump=sump+1;
                }
                }
            }
        }
        System.out.println("\n"+sumot+"количество отрицательных чисел");
        System.out.println(sump+"количество положительных чисел");

//11
        System.out.println("Введите строку на английском");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int ipo = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//метод берет символ из строки по индексу
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ipo++;
            }
        }
        double percentage = (double)ipo / str.length() * 100;
        System.out.println("Процент вхождения" + percentage + "%");



     //12
        int[] arr=new int[20];
        int ipo=0;
        for (int x=0;x<20;x++){
            arr[x]=(int)((Math.random()*2000-1000));//случ ч от -1000 до +
            System.out.print(arr[x]+" ");//для наглядности
        }
        for (int x=0;x<20;x++){
           if (arr[x]>=-100 && arr[x]<=100){
               ipo=ipo+1;
           }
        }
        System.out.println("\n"+ipo+"- количество элементов в диапазоне от -100 до +100");

  //13
        int[] arr=new int[5];
        int ipo=0;
        for (int x=0;x<5;x++){
            arr[x]=(int)((Math.random()*20-10));//случ ч от -10 до +10
            System.out.print(arr[x]+" ");//для наглядности
        }
        System.out.println("-исходный массив");
        int[] arryp=new int[5];//делаем 2 массив
        System.arraycopy(arr,0,arryp,0,5);/*метод копирования массива где
        откуда, с какого эл копировать , куда, с какого эл втсавлять, сколько вставлять*/
        /*Arrays.sort(arryp);//сортировка копии
        for (int x=0;x<5;x++){
            System.out.print(arryp[x]+" ");
        }
        System.out.println("-копия по порядку");
        for (int x=0;x<5;x++){
            if (arr[x]==arryp[x]){
                System.out.println(arr[x]+"-упорядоченное");
            }else {
                System.out.println(arr[x]+"-неупорядоченное");
            }
        }


         */


        //14






    }
}
