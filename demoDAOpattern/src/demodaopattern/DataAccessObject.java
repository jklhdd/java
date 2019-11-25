/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaopattern;

/**
 *
 * @author Long
 */
import java.util.ArrayList;

public interface DataAccessObject <S> {

    int create(S s);
    int update(S s);
    int delete(S s);
    ArrayList<S> read();
    S find(Integer id);
}
