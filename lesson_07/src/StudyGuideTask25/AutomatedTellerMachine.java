package StudyGuideTask25;

public class AutomatedTellerMachine {

    private int cash20;
    private int cash50;
    private int cash100;
    private int totalBalance;

    public AutomatedTellerMachine(int cash20, int cash50, int cash100) { // Конструктор
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    public void addMoney(int cash20add, int cash50add, int cash100add) { // Метод для добавления денег
        this.cash20 += cash20add;
        this.cash50 += cash50add;
        this.cash100 += cash100add;
    }

    public void balance() { // Метод для подсчёта общего баланса в банкомате
        this.totalBalance = (getCash20() * 20) + (getCash50() * 50) + (getCash100() * 100);
        System.out.println("Доступный баланс: " + getTotalBalance());
    }

    public boolean withdrawMoney(int sumOfMoney) { // Метод для снятия денег
        int c20 = 0;
        int c50 = 0;
        int c100 = 0;
        int tempSum = sumOfMoney; // Временная сумма денег

        if (this.totalBalance >= sumOfMoney) { // Проверяем, достаточно ли в банкомате средств
            // Проверяем, удовлетворяет ли введённая сумма наши исходные условия
            if (sumOfMoney % 10 != 0 || sumOfMoney == 10 || sumOfMoney % 100 == 30) {
                System.out.println("В банкомате имеются в наличии только купюры номиналом 20, 50 и 100!");
                return false;
            }
            // Отнимаем от введённой суммы количество денег, которое мы можем выдать купюрами номиналом 100
            if (this.cash100 != 0 && sumOfMoney >= 100) {
                sumOfMoney -= sumOfMoney % 100;
                c100 = sumOfMoney / 100;
                if (c100 > this.cash100) {
                    c100 = this.cash100;
                }
                sumOfMoney = tempSum - (c100 * 100);
            }
            // Проверяем, делится ли оставшаяся сумма без остатка на 50 или 70
            if (sumOfMoney % 50 == 0 || sumOfMoney % 70 == 0) {
                // Отнимаем от оставшейся суммы количество денег, которое мы можем выдать купюрами номиналом 50
                if (this.cash50 != 0 && sumOfMoney >= 50) {
                    sumOfMoney -= sumOfMoney % 50;
                    c50 = sumOfMoney / 50;
                    if (c50 > this.cash50) {
                        c50 = this.cash50;
                    }
                    sumOfMoney = tempSum - (c100 * 100 + c50 * 50);
                }
            }
            // Проверяем, делится ли оставшаяся сумма без остатка на 20, 40, 60 или 80
            if (sumOfMoney % 20 == 0 || sumOfMoney % 40 == 0 || sumOfMoney % 60 == 0 || sumOfMoney % 80 == 0) {
                // Отнимаем от оставшейся суммы количество денег, которое мы можем выдать купюрами номиналом 20
                if (this.cash20 != 0 && sumOfMoney >= 20) {
                    sumOfMoney -= sumOfMoney % 20;
                    c20 = sumOfMoney / 20;
                    if (c20 > this.cash20) {
                        c20 = this.cash20;
                    }
                    sumOfMoney = tempSum - (c100 * 100 + c50 * 50 + c20 * 20);
                }
            }
            // Если остаток от введённой суммы равен нулю, то выдаём деньги
            if (sumOfMoney == 0) {
                if(c20 != 0) {
                    System.out.printf("Выдано %d купюр номиналом 20\n", c20);
                    this.cash20 -= c20;
                }
                if(c50 != 0) {
                    System.out.printf("Выдано %d купюр номиналом 50\n", c50);
                    this.cash50 -= c50;
                }
                if(c100 != 0) {
                    System.out.printf("Выдано %d купюр номиналом 100\n", c100);
                    this.cash100 -= c100;
                }
                return true;
            }
        } else {
            System.out.println("В банкомате недостаточно средств.");
        }
        return false;
    }

    public int getCash20() {
        return cash20;
    }

    public int getCash50() {
        return cash50;
    }

    public int getCash100() {
        return cash100;
    }

    public int getTotalBalance() {
        return totalBalance;
    }
}