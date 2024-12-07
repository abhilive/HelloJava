package com.abhilive.javafundamentals;

import java.util.*;

public class PairSumTarget {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 8, 7, 6, 2, 3, 4, 5);
        int targetSum = 10;
        List<List<Integer>> result = findPairsWithTargetSum(nums, targetSum);

        System.out.println("Pairs with sum " + targetSum + ": " + result);
    }

    public static List<List<Integer>> findPairsWithTargetSum(List<Integer> nums, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                pairs.add(Arrays.asList(num, complement));
            }
            seen.add(num);
        }

        return pairs;
    }

//    public void saveData(PersonDto personDto) {
//        Person personData = personRepository.getPerson(personDto.getId());
//        personData.setUsername(personDto.getUserName());
//        personData.setEmployerName(personDto.getEmployerName());
//        if(addressRepository.getPersonAddressess(personDto.getId()).count().compareTo(ZERO) > 0) {
//            personData.hasAddress(true);
//        }
//        personData.save();
//    }
}

//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import static org.mockito.Mockito.*;
//
//public class YourClassUnderTestTest {
//
//    private final PersonRepository personRepository = mock(PersonRepository.class);
//    private final AddressRepository addressRepository = mock(AddressRepository.class);
//
//    private final YourClassUnderTest classUnderTest = new YourClassUnderTest(personRepository, addressRepository);
//
//    @Test
//    public void testSaveData_personExistsWithAddress() {
//        // Arrange
//        PersonDto personDto = new PersonDto();
//        personDto.setId(1L);
//        personDto.setUserName("testUser");
//        personDto.setEmployerName("testEmployer");
//
//        Person person = mock(Person.class);
//
//        when(personRepository.getPerson(1L)).thenReturn(person);
//        when(addressRepository.getPersonAddressess(1L)).thenReturn(() -> 1L); // Simulate non-zero count
//
//        // Act
//        classUnderTest.saveData(personDto);
//
//        // Assert
//        verify(personRepository).getPerson(1L);
//        verify(person).setUsername("testUser");
//        verify(person).setEmployerName("testEmployer");
//        verify(person).hasAddress(true);
//        verify(person).save();
//    }
//
//    @Test
//    public void testSaveData_personExistsWithoutAddress() {
//        // Arrange
//        PersonDto personDto = new PersonDto();
//        personDto.setId(1L);
//        personDto.setUserName("testUser");
//        personDto.setEmployerName("testEmployer");
//
//        Person person = mock(Person.class);
//
//        when(personRepository.getPerson(1L)).thenReturn(person);
//        when(addressRepository.getPersonAddressess(1L)).thenReturn(() -> 0L); // Simulate zero count
//
//        // Act
//        classUnderTest.saveData(personDto);
//
//        // Assert
//        verify(personRepository).getPerson(1L);
//        verify(person).setUsername("testUser");
//        verify(person).setEmployerName("testEmployer");
//        verify(person, never()).hasAddress(true);
//        verify(person).save();
//    }
//
//    @Test
//    public void testSaveData_personDoesNotExist() {
//        // Arrange
//        PersonDto personDto = new PersonDto();
//        personDto.setId(1L);
//
//        when(personRepository.getPerson(1L)).thenReturn(null);
//
//        // Act & Assert
//        assertThrows(NullPointerException.class, () -> classUnderTest.saveData(personDto));
//
//        verify(personRepository).getPerson(1L);
//        verifyNoInteractions(addressRepository);
//    }
//}


