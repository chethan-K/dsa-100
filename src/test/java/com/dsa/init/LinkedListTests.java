package com.dsa.init;

import com.dsa.init.linkedlist.SinglyLinkedList;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class LinkedListTests {

	@Test
	void testInsertAtHead() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.insertAtHead("data1");
		list.insertAtHead("data2");
		list.insertAtHead("data3");
		list.insertAtHead("data4");

		printDataInLinkedList(list);
	}

	@Test
	void testInsertAtEnd() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.insertAtEnd("data1");
		list.insertAtEnd("data2");
		list.insertAtEnd("data3");
		list.insertAtEnd("data4");
		list.insertAtEnd("data5");
		list.insertAtHead("data0");
		// data1 -> data2 -> data3 -> data4

		printDataInLinkedList(list);
	}

	@Test
	void testContains() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.insertAtEnd("data1");
		list.insertAtEnd("data2");
		list.insertAtEnd("data3");
		list.insertAtEnd("data4");
		list.insertAtEnd("data5");
		list.insertAtHead("data0");
		String key = "data7";
		log.info("Found key {} -> {}", key, list.contains(key));
	}

	@Test
	void deleteByValue() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.insertAtEnd("data1");
		list.insertAtEnd("data2");
		list.insertAtEnd("data3");
		list.insertAtEnd("data4");
		list.insertAtEnd("data5");
		log.info("List before delete : ");
		printDataInLinkedList(list);
		log.info("<---------->");
		String val = "data3";
		list.deleteByValue(val);
		log.info("List after deleting value : {}", val);
		printDataInLinkedList(list);
	}

	@Test
	void insertAfter() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.insertAtEnd("data1");
		list.insertAtEnd("data2");
		list.insertAtEnd("data3");
		list.insertAtEnd("data5");
		list.insertAtEnd("data6");
		log.info("List before delete : ");
		printDataInLinkedList(list);
		log.info("<---------->");
		String dataToInsert = "data4";
		String insertAfter = "data3";
		list.insertAfter(dataToInsert, insertAfter);
		log.info("List after inserting {} after {}", dataToInsert, insertAfter);
		printDataInLinkedList(list);
	}

	private void printDataInLinkedList(SinglyLinkedList<String> list) {
		SinglyLinkedList.Node node = list.headNode;
		while (node.nextNode != null){
			log.info("{}", node.data.toString());
			node = node.nextNode;
		}
		log.info("{}", node.data.toString());
	}
}
