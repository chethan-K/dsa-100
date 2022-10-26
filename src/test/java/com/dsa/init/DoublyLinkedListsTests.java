package com.dsa.init;

import com.dsa.init.linkedlist.DoublyLinkedList;
import com.dsa.init.linkedlist.LinkedListUtility;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DoublyLinkedListsTests {

    private void printDataInLinkedList(DoublyLinkedList<String> list) {
        DoublyLinkedList.Node node = list.headNode;
        while (node.nextNode != null){
            log.info("{}", node.data.toString());
            node = node.nextNode;
        }
        log.info("{}", node.data.toString());
    }

    @Test
    void testInsertAtHead() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data4");

        printDataInLinkedList(list);
    }

    @Test
    void testInsertAtEnd() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtEnd("data1");
        list.insertAtEnd("data2");
        list.insertAtEnd("data3");
        list.insertAtEnd("data4");

        printDataInLinkedList(list);
    }

    @Test
    void testReverse() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data4");
        log.info("Before reverse: ");
        printDataInLinkedList(list);
        LinkedListUtility<String> utility = new LinkedListUtility<>();
        utility.reverseDoubleList(list);
        log.info("After reverse: ");
        printDataInLinkedList(list);
    }
}
