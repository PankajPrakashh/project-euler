/*
 * Copyright (C) 2015 PankajPrakashh @ http://codeforwin.blogspot.com/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Pankaj
 */
public class ProjectEuler1 {
    
    public static void main(String args[]) {
        long n = 1000000000000l;
        n--; //Since we need to compute sum below n.
        
        long sum = 0;
        long totalElements = 0l;
        
        //Check if n is more than ot equal to 3 then compute sum of all elements
        //divisible by 3 amd add to sum.
        if(n>=3) {
            totalElements = n/3;
            sum += (totalElements * ( 3 + totalElements*3)) / 2;
        }
        
        //Check if n is more than or equal to 5 then compute sum of all elements 
        //divisible by 5 and add to sum.
        if(n >= 5) {
            totalElements = n/5;
            sum += (totalElements * (5 + totalElements * 5)) / 2;
        }
        
        //Check if n is more than or equal to 15 then compute sum of all elements
        //divisible by 15 and subtract from sum.
        if(n >= 15) {
            totalElements = n/15;
            sum -= (totalElements * (15 + totalElements * 15)) / 2;
        }
        
        System.out.println(sum);
    }
}
