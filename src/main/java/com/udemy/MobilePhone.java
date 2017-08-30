package com.udemy;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone
{
    private ArrayList<Contacts> clist= new ArrayList<Contacts>();



    public boolean  addContact(Contacts input)
    {

        if(findContact(input.getName())>=0)
        {
            System.out.println("contact already exists");
            return false;
        }
        this.clist.add(input);
        return true;

    }

    public boolean updateContact(Contacts old_ct, Contacts new_ct)
    {
        int index=findContact(old_ct);
        if (index < 0) {
            System.out.println("contact  does not exists .Cannot update");
            return false;
        }
        else
        {
            old_ct=this.clist.set(index,new_ct);
            return true;
        }

    }



    public boolean removeContact(Contacts input)
    {
        if(findContact(input)<0)
        {
            System.out.println("contact  does not exists .Cannot remove");
            return false;
        }

        return this.clist.remove(input);


    }
    public void printAllContacts()
    {


        for (int i =0;i<this.clist.size();i++)
        {
            Contacts ct =this.clist.get(i);
            System.out.println(ct.getName()+"=>"+ct.getPhone());
        }



    }

    public void printContact(Contacts input)
    {


            System.out.println(input.getName()+"=>"+input.getPhone());




    }

    public Contacts queryContact(String name )
    {


        for (int i =0;i<this.clist.size();i++)
        {
            Contacts ct =this.clist.get(i);
            if ( ct.getName().equals(name))
                return ct;

        }
        return null;


    }


    private int findContact(String name)
    {

        for (int i=0;i < this.clist.size();i++)
        {

            if (clist.get(i).getName().equals(name))
                return i ;

        }
        return -1 ;
    }


    private int findContact(Contacts ct )
    {
        return this.clist.indexOf(ct);
    }





}
