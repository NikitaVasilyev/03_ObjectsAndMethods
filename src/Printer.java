public class Printer {
    private static String queue = "";
    private static int pagesCount = 0;
    private static int documentsCount = 0;
    private static int totalCount = 0;

    public static void main(String[] args) {
        append("Документ №1", "Документ №1 на печати.", 2);
        append("Документ №2", "Документ №2 на печати.", 2);
        append("Документ №3", "Документ №3 на печать.", 2);
        print("Документы на печать: ");
        int pagesCount = getPagesCont();
        int documentsCount = getDocumentsCount();
        int totalCount = getTotalCount();
        System.out.println("Общее количество страниц на печать: " + pagesCount);
        System.out.println("Общее количество документов на печать: " + documentsCount);
        clear();
        System.out.println();
        print("Документы на печать: " + getDocumentsCount());
        pagesCount = getPagesCont();
        documentsCount = getDocumentsCount();
        System.out.println("Общее количество страниц на печать: " + pagesCount);
        System.out.println("Общее количество документов на печать: " + documentsCount);
    }

    public static void append(String name, String text){
        append(name, text, 1);
    }

    public static void append(String name, String text, int page){
        append(name, text, page, 1);
    }

    public static void append(String name, String text, int page, int document){
        queue = queue + "\nНаименование документа: " + name + "\nТекст документа: " + text + "\nКоличество страниц в документе: " + page + "\nКоличество документов: " + document + "\n";
        pagesCount = pagesCount + page;
        documentsCount = documentsCount + document;
        totalCount = page * documentsCount;
    }

    public static void clear(){
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }

    public static int getPagesCont(){
        return pagesCount;
    }

    public static int getDocumentsCount(){
        return documentsCount;
    }

    public static int getTotalCount(){
        return totalCount;
    }

    public  static void print(String title){
        System.out.println(title);
        if (queue.isEmpty()){
            System.out.println("В очереди на печать нет документов." + "\nОбщее количество распечатанных страниц: " + totalCount);
        }else {
            System.out.println(queue);
        }
    }
}
