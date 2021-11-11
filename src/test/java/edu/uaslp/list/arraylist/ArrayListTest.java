package edu.uaslp.list.arraylist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.uaslp.list.Iterator;
import edu.uaslp.list.MyIndexOutOfBoundException;


public class ArrayListTest {

    @Test
    public void whenListIsCreated_thenSizeIsZero() {
        // given:
        Arraylist<Integer> list = new Arraylist<>();

        // when:
        int size = list.getSize();

        // then:
        Assertions.assertEquals(0, size);

    }

    @Test
    public void givenANewList_whenAdd_thenSizeIsOne(){
        // given:
        Arraylist<String> list = new Arraylist<>();

        // when:
        list.add("Mario");

        // then:
        Assertions.assertEquals(1, list.getSize());
    }

    @Test
    public void givenAListWithOneElement_whenAdd_thenSizeIsTwo(){
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Luis");

        // when:
        list.add("Mario");

        // then:
        Assertions.assertEquals(2, list.getSize());
    }

    @Test
    public void givenAListWithThreeElements_whenGetAt_thenElementsAreReturnedSuccessfully() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Luis");
        list.add("Maria");
        list.add("Pancho");

        // when:
        // then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Luis", list.getAt(0));
        Assertions.assertEquals("Maria", list.getAt(1));
        Assertions.assertEquals("Pancho", list.getAt(2));
    }



    @Test
    public void givenAnEmptyList_whenInsert_thenElementIsInsertedSuccessfully() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<Float> list = new Arraylist<>();

        // when:
        list.insert(3.5f, 0);

        // then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals(3.5f, list.getAt(0));
    }

    @Test
    public void whenInsertForIndexLessThanZero_thenElementIsNotInserted(){
        // given:
        Arraylist<Float> list = new Arraylist<>();

        // when:
        list.insert(3.5f, -1);

        // then:
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void whenInsertForIndexGreaterThanSize_thenElementIsNotInserted(){
        // given:
        Arraylist<Float> list = new Arraylist<>();

        // when:
        list.insert(3.5f, 1);

        // then:
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex1_thenElementIsInserted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Tercero");

        // when:
        list.insert("Segundo", 1);

        // then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex0_thenElementIsInserted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Segundo");
        list.add("Tercero");

        // when:
        list.insert("Primero", 0);

        // then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenInsertForIndex2_thenElementIsInserted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");

        // when:
        list.insert("Tercero", 2);

        // then:
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
        Assertions.assertEquals("Tercero", list.getAt(2));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex0_thenElementIsDeleted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");

        // when:
        list.delete( 0);

        // then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Segundo", list.getAt(0));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndexMinus1_thenElementIsNotDeleted() throws MyIndexOutOfBoundException{
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");

        // when:
        list.delete( -1);

        // then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex3_thenElementIsNotDeleted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");

        // when:
        list.delete( 3);

        // then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Segundo", list.getAt(1));
    }

    @Test
    public void givenAListWith2Elements_whenDeleteForIndex1_thenElementIsDeleted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");

        // when:
        list.delete( 1);

        // then:
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
    }

    @Test
    public void givenAListWith3Elements_whenDeleteForIndex1_thenElementIsDeleted() throws MyIndexOutOfBoundException {
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");

        // when:
        list.delete( 1);

        // then:
        Assertions.assertEquals(2, list.getSize());
        Assertions.assertEquals("Primero", list.getAt(0));
        Assertions.assertEquals("Tercero", list.getAt(1));
    }

    @Test
    public void givenAListWith3Elements_whenIterator_thenIteratorWorksFine(){
        // given:
        Arraylist<String> list = new Arraylist<>();

        list.add("Primero");
        list.add("Segundo");
        list.add("Tercero");

        // when:
        Iterator<String> it = list.getIterator();

        // then:
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Primero", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Segundo", it.next());
        Assertions.assertTrue(it.hasNext());
        Assertions.assertEquals("Tercero", it.next());
        Assertions.assertFalse(it.hasNext());
    }

}