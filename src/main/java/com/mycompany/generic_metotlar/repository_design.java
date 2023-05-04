/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generic_metotlar;

/**
 *
 * @author melek
 */
public class repository_design {
    
    //repository deseni veritabanı işlemleri için kullanılır
//ekleme-silme-güncelleme-select(datayı çekmek)
//tablolardaki alanlar değişir

//generic constraint 

public interface IEntityRepository<T extends IEntity>{ //generic sınıfları implement ederken extend ifadesi kullan
  void add(T entity); //entity veritabanı nesnesini ekledik
  void delete(T entity);
  void update(T entity);


}

public class CustomerDal implement IEntityRepository<Customer>{
    @override

    public void add(Customer entity){

    }
 
    @override
    public void delete(Customer entity){

    }

    @override
    public void update(Customer entity){

    }
}

public class Customer{


}

public class Product{

}


public class ProductDal implements  IEntityRepository<Product>{

    @override

    public void add(Product entity){

    }
 
    @override
    public void delete(Product entity){

    }

    @override
    public void update(Product entity){

    }


}

public class Validator{ //veritabanıyla ilgisi olmayan class


}

public interface IEntity{

}

public class Customer implements IEntity{ //interfacelerin gruplama özelliğinden yararlandık.
    //customer classını IEntity grubuna katıyoruz


}
    
}
