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
public class ProjectEuler2 {
    
    public static void main(String args[] ){
        long a,b,c, sum = 0L;
        a = 0;
        b = 0;
        c = 1;
        
        while(c<=4000000) {
            
            if(c%2==0)
                sum += c;
            
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println(sum);
    }
}
