/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Sekar Arum
 */
class Kalkulator implements Operasi
    {
        private double bil1, bil2;
        public Kalkulator (){}
        public Kalkulator (double bil1, double bil2)
        {
            this.bil1 = bil1;
            this.bil2 = bil2;
        }
        @Override
        public void Penjumlahan() 
        {
           System.out.println(bil1 + bil2);
        }
        @Override
        public void Pengurangan() 
        {
            System.out.println(bil1 - bil2);
        }
        @Override
        public double Perkalian() 
        {
           return bil1 * bil2;
        }
        @Override
        public double Pembagian() 
        {
            return bil1 / bil2;
        }
    }

