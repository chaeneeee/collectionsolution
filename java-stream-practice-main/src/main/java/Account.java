 class Account {
    private int balance = 1000;

    public  int getBalance() {
        return  balance;

    }

    public boolean withdraw(int money){

        if (balance >= money){
            try {
                Thread.sleep(1000); } catch (Exception error){}


            balance-=money;
            return true;
            }
            return false;
    }
    }


