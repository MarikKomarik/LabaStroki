import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class stroki {

    public static void main(String[] args) {
        /*
//1
          Scanner sc = new Scanner(System.in); // создаём объект класса Scanner121212121
        String Dopusk=" qwertyuiopasdfghjklzxcvbnm1234567890_ ";//все что можно
        String digits="0987654321";//без коментариев
        System.out.print("Введите строку");
        String str=sc.nextLine();
        str=str.toLowerCase();//регистр весь маленький
        int S=0;
        int chetchikNeravensta=0;
        int Simno=-10;
        if (!(str.isEmpty())){//проверка не пустой ли
            for(int x=0;x<10;x++){//Проверку на цифру
                if(str.charAt(0)==digits.charAt(x)){
                    S=-2;
                    System.out.println("-2 НАЧИНАЕТСЯ С ЦИФРРЫ");
                    break;
                }
            }
            for (int x=0;x<str.length();x++){// проверка на символы
                for (int i=0;i<Dopusk.length()-1;i++){
                    if(!(str.charAt(x)== Dopusk.charAt(i))){//проверка кажджого символа есть ли он в допуске
                        chetchikNeravensta=chetchikNeravensta+1;//перемнная сколько раз не равен символу в допуске,
                    }
                }
                if(chetchikNeravensta==Dopusk.length()-1){//если не равен всем символам в допуске
                    Simno=x;
                    break;//прекратить цикл если найден недопустимый
                }
                chetchikNeravensta=0;//обнуляем счетчик
            }
        }else{//если пустая
            S=-1;
            System.out.println("-1 , ПУСТАЯ СТРОКА");
        }
        if ((Simno>-1)&& !(S==-1)&&!(S==-2)){//если каждый символ прошел допуск и строка не пустая
            S=-100;
            System.out.println("НЕДОПУСТИМЫЕ СИМВОЛЫ, ИНДЕКС ПЕРВОГО - "+Simno);
        }
        if(S==0){//если все норм
            System.out.println(S+", ВСЕ НОРМ");
        }


//2
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите N");
        int N= sc.nextInt();
        System.out.println("Введите шаблон строки");
        String shablonS=sc.next();
        String strN="";
        int i=N/shablonS.length();//количество целых строк которое поместится
        int o=N%shablonS.length();//остаток от деления, сколько символов еще надо
        for (int x=0;x<i;x++){
            strN=strN.concat(shablonS);//тут и + можно было
        }
        for (int x=0;x<o;x++){
            strN=strN+shablonS.charAt(x);
        }
        System.out.println("Строка длины N , заполнена шаблонами- "+strN);

//3 4
        String S ="Ты ЧеГо ТаКаЯ БяКа)? Ne Zlis))";
        String dopusk="ЙЦУКЕЁНГШЩЗХЪЭЖДЮБЛЬОТРИПМАСВЧЫФЯ";
        char[] dopuskch=dopusk.toCharArray();//массив русских букв
        char[] Sarr=S.toUpperCase().toCharArray();//массив для сравнения без регистра
        char[] ishod=S.toCharArray();//массив в котором будут меняться русские буквы
        for (int x=0;x<S.length();x++){//для каждого символа строки
            for(int i=0;i<dopusk.length();i++){//проверятеся для каждого русского
                if(Sarr[x]==dopuskch[i]){//если русский то регистр нижний
                    ishod[x]=Sarr[x];
                }
            }
        }
        System.out.println(S);
        System.out.println(ishod);
 //5-6
        String S="amsterdam";
        char c='m';
        for(int x=0;x<S.length();x++){
            if(S.charAt(S.length()-1)==c){//символ по индексу
                S=S.substring(0,S.length()-1);//метод берет символы строки с 1 индекса
                break;                     //по последний
            }
        }
        System.out.println(S);
//7
        String S="0123456789абвгде";
        String reverse="";
        char[] S1=S.toCharArray();
        int N=10;//скока
        int K=8;//скакова
        int i=0;//счетчик для N
        int kn=K+N;//чтобы менять можно было
        if (K>S.length()) {
            System.out.println("Типа пустая строка");
        }else {
            if(K+N>S.length()-1){
                kn=S.length();
            }
            for (int x =kn-1; i < N; x--) {//начиная с к+н в обратную сторону
                reverse = reverse + S1[x];
                i++;
            }


        }
        System.out.println(S);
        System.out.println(reverse+" N="+N+" K="+K);
//8
        String S="Саша Шла Саша по шоссе и сосала сушку";
        String isk="";
        String slovo="Вика";
        int len = S.length();
        int K=5;
        int N=10;
        if (K + N > len) {
            N = len - K;//чтобы N + K=len
        }
        if (K > len) {
            System.out.println(0);
        }else {
            isk=S.substring(K,K+N);//где будем искать
        }
        int index =isk.indexOf(slovo);//ищем индекс вхождения Саши
        System.out.println(S+"  ");
        if(!(index==-1)) {
            System.out.print("Индекс вхождения "+slovo+" равен:");
            System.out.println(index+K+" /K="+K+" N="+N);//прибавляем К, относительно S

        }else{
            System.out.println(slovo+" не найдено "+0);
        }
//9
        String S="_12_45_789012_4_67";//оригинал поиска
        String slovo="_";//что будем искать
        int index;//индекс первого вхождения
        int K=0;//переменная(индекс посл. вхож) которая урезает поиск с начала
        String isk=S.substring(K);//где будем искать, но в обрезанном виде
        //метод выше создает строку из оригинала , но начало берет с индекса К
        for (int x=0;x<S.length();x++){//для каждого символа в строке
            index=isk.indexOf(slovo);//смотрим индекс вхождения
            if(index>-1){//если поиск удался
                K=K+1;//то переменную увеличиваем,до тех пор пока искать будет нечего
                isk=S.substring(K);//иск урезаем в начале , уже без того что нашли в прошлый раз
            }//если ничего не нашлось, то индекс последнего вхождения  это K-1
        }
        System.out.println(K-1+" - индекс последнего вхождения:");
        System.out.println(slovo+" в "+S);

         *

 //10
        String S="_12_45_789012_4_67";//оригинал поиска
        String slovo="_";//что будем искать
        int index;//индекс первого вхождения
        int K1=3;//номер вхождения которое надо найти
        int K0=0;//переменная для счета вхождений
        int K=0;//переменная(индекс посл. вхож) которая урезает поиск с начала
        String isk=S.substring(K);//где будем искать, но в обрезанном виде
        //метод выше создает строку из оригинала , но начало берет с индекса К
        for (int x=0;x<S.length();x++){//для каждого символа в строке
            index=isk.indexOf(slovo);//смотрим индекс вхождения
            if(index>-1){//если поиск удался
                K0=K0+1;//счетчик вхождений
                K=K+index+1;//Урезаем больше чем в прошлый раз чтобы отбросить прошлое вхождение
                isk=S.substring(K);//иск урезаем в начале , уже без того что нашли в прошлый раз
                if (K0==K1){//если вхождение равно искомому то выводим на экран
                    System.out.println(K-1+" - индекс "+K0+" вхождения");
                    System.out.println(slovo+" в "+S);
                    break;
                }
            }
        }
        if (K0<K1){
            System.out.println(0);//условие задачи
        }


//14
        int dvoich=0;
        int S=dvoich;//тавтология
        String shest="";
        int temp2=0;
        if(dvoich==0){//если 0 то 0
            shest="0";
        }else{
            for (int x=0;x<10;x++) {
                temp2 = dvoich % 16;//остаток надо приписывать левее
                dvoich=dvoich / 16;//а потом остаток от целого деления и так по новой
                if(temp2<10) {//если меньше 10 то цифру можно не менять
                    if((temp2==0)&&(dvoich==0)){//если целая часть и остаток = 0 то конец цикла
                        break;
                    }else {
                        shest = temp2 + shest;//остаток приписываем слева
                    }
                }else{//если больше 10 то надо уже символ от А до F
                    temp2=temp2-10;//узнаем индекс
                    shest=(char)(65+temp2)+shest;//в инете нашел, символ А(65) представляется
                    // в виде юникода и в зависимости от темп2 юникод меняется
                    //а потом обратно преобразуется в символ и прибавляется к строке
                }
            }
        }
        System.out.println("число "+S+" в 16ричном:"+shest);

//15
        String _16="4D2";//А в юникоде это 65 , а 0 это 48
        double temp;//хранит в себе смысл 16ричной цифры в 10чном виде
        double stepen=0;//без коментариев
        double dvoich=0;//итог, дабл потому что метод pow только с даблом работает
        for(int x=_16.length()-1;x>=0;x--){//для каждого символа в строке 16чной
            if((int)_16.charAt(x)>64){//если это символ, то онимаем от юникода 55
                temp=(_16.charAt(x)-55)*(Math.pow(16.0,stepen));//цифру умножаем на порядок
            }else{//если число то 48 от юникода
                temp=(_16.charAt(x)-48)*(Math.pow(16.0,stepen));
            }
            dvoich=dvoich+temp;//прибавляем к общему результату
            stepen=stepen+1;//с каждым циклом степень 16 надо увеличивать
        }
        System.out.println(_16+" это "+(int)dvoich);

         */

    }
}

