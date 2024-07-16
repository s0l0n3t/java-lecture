public class ProductTable {
    //Creating table array
    private String orderString[] = {"1000","1000","1000","1000","1000","1001","1001","1001","1001","1002","1002","1002","1002","1002","1002"};
    private String productNumber[] = {"2000","2001","2002","2003","2004","2001","2002","2004","2002","2003","2004","2003","2002","2005","2006"};
    private int countArray[] = {12,31,22,41,55,88,121,74,14,2,3,8,16,9,19};
    private float productPrice[] = {100.51f,200f,150.86f,250f,244f,44.531f,88.11f,211f,88.11f,12.1f,22.3f,12.1f,94f,44.1f,90f};


    ProductTable(){
        
        calculate();
    }
    private void calculate(){
        //create array for per order number 3 lenghts.
        int orderCountArray0[] = new int[3];
        int orderCountArray1[] = new int[3];
        int orderCountArray2[] = new int[3];
        int orderCountArray3[] = new int[3];
        int orderCountArray4[] = new int[3];
        int orderCountArray5[] = new int[3];
        int orderCountArray6[] = new int[3];
        float sumPrice = 0;
        float avaragePrice0= 0;
        float avaragePrice1= 0;
        float avaragePrice2= 0;
        float avaragePrice3= 0;
        float avaragePrice4= 0;
        float avaragePrice5= 0;
        float avaragePrice6= 0;
        int sumPriceNumber = 0;
        int priceCount0 = 0;
        int priceCount1 = 0;
        int priceCount2 = 0;
        int priceCount3 = 0;
        int priceCount4 = 0;
        int priceCount5 = 0;
        int priceCount6 = 0;
        
        System.out.println("Sipariş | Mal Numarasi | Miktar | Birim Fiyati(TL)");
        for(int i = 0; i<orderString.length;i++){
            sumPrice+=this.productPrice[i]*this.countArray[i];//sum
            sumPriceNumber += this.countArray[i];//count
            if(orderString[i].equals("1000")){//orderNumber
                System.out.print(this.orderString[i]+" ");
                System.out.print(this.productNumber[i]+" ");
                System.out.print(this.countArray[i]+" ");
                System.out.print(this.productPrice[i]+" ");
                System.out.println();
                
                if(productNumber[i].equals("2000")){
                    avaragePrice0 += this.productPrice[i]*this.countArray[i];
                    priceCount0 += this.countArray[i];
                    orderCountArray0[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2001")){
                    avaragePrice1 += this.productPrice[i]*this.countArray[i];
                    priceCount1 += this.countArray[i];
                    orderCountArray1[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2002")){
                    avaragePrice2 += this.productPrice[i]*this.countArray[i];
                    priceCount2 += this.countArray[i];
                    orderCountArray2[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2003")){
                    avaragePrice3 += this.productPrice[i]*this.countArray[i];
                    priceCount3 += this.countArray[i];
                    orderCountArray3[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2004")){
                    avaragePrice4 += this.productPrice[i]*this.countArray[i];
                    priceCount4 += this.countArray[i];
                    orderCountArray4[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2005")){
                    avaragePrice5 += this.productPrice[i]*this.countArray[i];
                    priceCount5 += this.countArray[i];
                    orderCountArray5[0] = this.countArray[i];
                }
                if(productNumber[i].equals("2006")){
                    avaragePrice6 += this.productPrice[i]*this.countArray[i];
                    priceCount6 += this.countArray[i];
                    orderCountArray6[0] = this.countArray[i];
                }
            }
            if(orderString[i].equals("1001")){//orderNumber
                System.out.print(this.orderString[i]+" ");
                System.out.print(this.productNumber[i]+" ");
                System.out.print(this.countArray[i]+" ");
                System.out.print(this.productPrice[i]+" ");
                System.out.println();
                if(productNumber[i].equals("2000")){
                    avaragePrice0 += this.productPrice[i]*this.countArray[i];
                    priceCount0 += this.countArray[i];
                    orderCountArray0[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2001")){
                    avaragePrice1 += this.productPrice[i]*this.countArray[i];
                    priceCount1 += this.countArray[i];
                    orderCountArray1[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2002")){
                    avaragePrice2 += this.productPrice[i]*this.countArray[i];
                    priceCount2 += this.countArray[i];
                    orderCountArray2[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2003")){
                    avaragePrice3 += this.productPrice[i]*this.countArray[i];
                    priceCount3 += this.countArray[i];
                    orderCountArray3[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2004")){
                    avaragePrice4 += this.productPrice[i]*this.countArray[i];
                    priceCount4 += this.countArray[i];
                    orderCountArray4[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2005")){
                    avaragePrice5 += this.productPrice[i]*this.countArray[i];
                    priceCount5 += this.countArray[i];
                    orderCountArray5[1] = this.countArray[i];
                }
                if(productNumber[i].equals("2006")){
                    avaragePrice6 += this.productPrice[i]*this.countArray[i];
                    priceCount6 += this.countArray[i];
                    orderCountArray6[1] = this.countArray[i];
                }


                
            }
            if(orderString[i].equals("1002")){//orderNumber
                System.out.print(this.orderString[i]+" ");
                System.out.print(this.productNumber[i]+" ");
                System.out.print(this.countArray[i]+" ");
                System.out.print(this.productPrice[i]+" ");
                System.out.println();
                if(productNumber[i].equals("2000")){
                    avaragePrice0 += this.productPrice[i]*this.countArray[i];
                    priceCount0 += this.countArray[i];
                    orderCountArray0[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2001")){
                    avaragePrice1 += this.productPrice[i]*this.countArray[i];
                    priceCount1 += this.countArray[i];
                    orderCountArray1[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2002")){
                    avaragePrice2 += this.productPrice[i]*this.countArray[i];
                    priceCount2 += this.countArray[i];
                    orderCountArray2[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2003")){
                    avaragePrice3 += this.productPrice[i]*this.countArray[i];
                    priceCount3 += this.countArray[i];
                    orderCountArray3[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2004")){
                    avaragePrice4 += this.productPrice[i]*this.countArray[i];
                    priceCount4 += this.countArray[i];
                    orderCountArray4[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2005")){
                    avaragePrice5 += this.productPrice[i]*this.countArray[i];
                    priceCount5 += this.countArray[i];
                    orderCountArray5[2] = this.countArray[i];
                }
                if(productNumber[i].equals("2006")){
                    avaragePrice6 += this.productPrice[i]*this.countArray[i];
                    priceCount6 += this.countArray[i];
                    orderCountArray6[2] = this.countArray[i];
                }
                
            }//Normalde döngüdeki productPrice dizisi elemanlarını toplayarak toplam sipariş tutarı ve ortalaması elde edilebilirdi.
            //Fakat bunu yapmakdaki amacım, şuanda dizi işlemi olan işlemi veritabanı sorgusuna çevirmek istediğimde daha kolay olabilmesini sağlamaktır.
        }
        System.out.println("\nOrder sum: "+ sumPrice);
        System.out.println("Order avarage: "+ sumPrice/sumPriceNumber);
        System.out.println("Order number 2000 avarage: "+ avaragePrice0/priceCount0);
        System.out.println("Order number 2001 avarage: "+ avaragePrice1/priceCount1);
        System.out.println("Order number 2002 avarage: "+ avaragePrice2/priceCount2);
        System.out.println("Order number 2003 avarage: "+ avaragePrice3/priceCount3);
        System.out.println("Order number 2004 avarage: "+ avaragePrice4/priceCount4);
        System.out.println("Order number 2005 avarage: "+ avaragePrice5/priceCount5);
        System.out.println("Order number 2006 avarage: "+ avaragePrice6/priceCount6);
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2000 in order 1000: "+ orderCountArray0[0]);
        System.out.println("Product count 2000 in order 1001: "+ orderCountArray0[1]);
        System.out.println("Product count 2000 in order 1002: "+ orderCountArray0[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2001 in order 1000: "+ orderCountArray1[0]);
        System.out.println("Product count 2001 in order 1001: "+ orderCountArray1[1]);
        System.out.println("Product count 2001 in order 1002: "+ orderCountArray1[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2002 in order 1000: "+ orderCountArray2[0]);
        System.out.println("Product count 2002 in order 1001: "+ orderCountArray2[1]);
        System.out.println("Product count 2002 in order 1002: "+ orderCountArray2[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2003 in order 1000: "+ orderCountArray3[0]);
        System.out.println("Product count 2003 in order 1001: "+ orderCountArray3[1]);
        System.out.println("Product count 2003 in order 1002: "+ orderCountArray3[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2004 in order 1000: "+ orderCountArray4[0]);
        System.out.println("Product count 2004 in order 1001: "+ orderCountArray4[1]);
        System.out.println("Product count 2004 in order 1002: "+ orderCountArray4[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2005 in order 1000: "+ orderCountArray5[0]);
        System.out.println("Product count 2005 in order 1001: "+ orderCountArray5[1]);
        System.out.println("Product count 2005 in order 1002: "+ orderCountArray5[2]);
        System.out.println("------------------------------------------------------------");
        System.out.println("Product count 2006 in order 1000: "+ orderCountArray6[0]);
        System.out.println("Product count 2006 in order 1001: "+ orderCountArray6[1]);
        System.out.println("Product count 2006 in order 1002: "+ orderCountArray6[2]);
        
        
    }
    //Getter and Setters (Kolaylık açısından Lombok kullanılabilir ve @Data anotasyonu ile costructor ve getter setterlar tanımlanabilir.)
    public int[] getCountArray() {
        return countArray;
    }
    public String[] getOrderString() {
        return orderString;
    }
    public String[] getProductNumber() {
        return productNumber;
    }
    public float[] getProductPrice() {
        return productPrice;
    }
    public void setCountArray(int[] countArray) {
        this.countArray = countArray;
    }
    public void setOrderString(String[] orderString) {
        this.orderString = orderString;
    }
    public void setProductNumber(String[] productNumber) {
        this.productNumber = productNumber;
    }
    public void setProductPrice(float[] productPrice) {
        this.productPrice = productPrice;
    }

}
