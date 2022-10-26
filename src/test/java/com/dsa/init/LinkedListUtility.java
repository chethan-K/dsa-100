package com.dsa.init;

import com.dsa.init.linkedlist.CheckIntersections;
import com.dsa.init.linkedlist.CheckPalindromeOnDoublyLL;
import com.dsa.init.linkedlist.DetectLoop;
import com.dsa.init.linkedlist.DoublyLinkedList;
import com.dsa.init.linkedlist.FindMiddleNode;
import com.dsa.init.linkedlist.LLinkedList;
import com.dsa.init.linkedlist.LinkedListNode;
import com.dsa.init.linkedlist.RemoveDuplicates;
import com.dsa.init.linkedlist.ReverseAlternativeKNodes;
import com.dsa.init.linkedlist.ReverseLinkedList;
import com.dsa.init.linkedlist.RotateLinkedList;
import com.dsa.init.linkedlist.SinglyLinkedList;
import com.dsa.init.linkedlist.UnionIntersection;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
@Slf4j
class LinkedListUtility {

    private void printDataInLinkedList(SinglyLinkedList<String> list) {
        SinglyLinkedList.Node node = list.headNode;
        while (node.nextNode != null){
            log.info("{}", node.data.toString());
            node = node.nextNode;
        }
        log.info("{}", node.data.toString());
    }

    @Test
    void findLoopTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data4");
        log.info("Before adding loop, find loop {}", DetectLoop.detect(list));
        list.headNode.nextNode.nextNode.nextNode = list.headNode;
        log.info("After adding loop, find loop {}", DetectLoop.detect(list));
    }

    @Test
    void findMiddleNodeTest() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data4");
        list.insertAtHead("data5");
        SinglyLinkedList.Node middleNode = FindMiddleNode.find(list);
        log.info("After adding loop, find loop {}", middleNode.data);
    }

    @Test
    void removeDuplicates() {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.insertAtHead("data5");
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data4");
        list.insertAtHead("data5");
        log.info("Before removal of duplicates : ");
        printDataInLinkedList(list);
        RemoveDuplicates.removeDuplicates(list);
        log.info("After removal of duplicates : ");
        printDataInLinkedList(list);
    }

    @Test
    void testUnion() {
        SinglyLinkedList<String> list1 = new SinglyLinkedList<>();
        list1.insertAtHead("data1");
        list1.insertAtHead("data2");
        list1.insertAtHead("data2");
        list1.insertAtHead("data3");
        list1.insertAtHead("data4");
        list1.insertAtHead("data5");

        SinglyLinkedList<String> list2 = new SinglyLinkedList<>();
        list2.insertAtHead("data4");
        list2.insertAtHead("data5");
        list2.insertAtHead("data6");
        list2.insertAtHead("data7");

        log.info("Before the union list1 : ");
        printDataInLinkedList(list1);

        log.info("Before the union list2 : ");
        printDataInLinkedList(list2);

        UnionIntersection.unionLists(list1, list2);
        log.info("After the union list1 : ");
        printDataInLinkedList(list1);
    }

    @Test
    void testIntersection() {
        SinglyLinkedList<String> list1 = new SinglyLinkedList<>();
        list1.insertAtHead("data1");
        list1.insertAtHead("data2");
        list1.insertAtHead("data2");
        list1.insertAtHead("data3");
        list1.insertAtHead("data4");
        list1.insertAtHead("data5");

        SinglyLinkedList<String> list2 = new SinglyLinkedList<>();
        list2.insertAtHead("data4");
        list2.insertAtHead("data5");
        list2.insertAtHead("data6");
        list2.insertAtHead("data7");

        log.info("Before the intersection list1 : ");
        printDataInLinkedList(list1);

        log.info("Before the intersection list2 : ");
        printDataInLinkedList(list2);

        SinglyLinkedList<String> result = UnionIntersection.intersectionLists(list1, list2);
        log.info("After the intersection list1 : ");
        printDataInLinkedList(result);
    }

    @Test
    void checkPalindrome() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertAtHead("data1");
        list.insertAtHead("data2");
        list.insertAtHead("data3");
        list.insertAtHead("data2");
        list.insertAtHead("data1");
        list.insertAtHead("data1");
        CheckPalindromeOnDoublyLL<String> checkPalindromeOnDoublyLL = new CheckPalindromeOnDoublyLL<>();
        log.info("is palindrome {}", checkPalindromeOnDoublyLL.check(list));
    }

    @Test
    void checkLinkedListsIntersection() {
        LLinkedList ll1 = new LLinkedList();
        LLinkedList ll2 = new LLinkedList();
        ll1.createLinkedList(List.of(1,2,3,4,5,6));
        ll2.createLinkedList(List.of(1,2));
        // 1,2,3,4
        //
        // 1,2,5,6
        ll2.head.next.next = ll1.head.next.next.next.next.next;
        CheckIntersections checkIntersections = new CheckIntersections();
        LinkedListNode result = checkIntersections.check(ll1, ll2);
        if(result != null){
            log.info("intersection found at - {}",result.data);
        } else {
            log.info("intersection not found!");
        }
    }

    @Test
    void checkRotateLinkedList() {
        LLinkedList ll1 = new LLinkedList();
        ll1.createLinkedList(List.of(1,2,3,4,5,6));
        log.info("Before rotate : ");
        ll1.displayLinkedList();
        int rotateBy = 0;
        RotateLinkedList.rotate(ll1, rotateBy);
        log.info("after rotate by {} : ", rotateBy);
        RotateLinkedList.rotate(ll1, 7);
        ll1.displayLinkedList();
        RotateLinkedList.rotate(ll1, -7);
        ll1.displayLinkedList();
        log.info("------");

//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
//        RotateLinkedList.rotate(ll1, 1);
//        ll1.displayLinkedList();
    }

    @Test
    void reverseLinkedList() {
        LLinkedList ll1 = new LLinkedList();
        ll1.createLinkedList(List.of(1,2,3,4,5,6));
        log.info("Before reverse : ");
        ll1.displayLinkedList();
        ReverseLinkedList.reverse(ll1);
        log.info("after reverse : ");
        ll1.displayLinkedList();
    }

    @Test
    void reverseLinkedKthList() {
        LLinkedList ll1 = new LLinkedList();
        ll1.createLinkedList(List.of(1,2,3,4,5,6));
        log.info("Before reverse : ");
        ll1.displayLinkedList();
        ReverseAlternativeKNodes.reverseKNodes(ll1, 3);
        log.info("after reverse : ");
        ll1.displayLinkedList();
    }

}
