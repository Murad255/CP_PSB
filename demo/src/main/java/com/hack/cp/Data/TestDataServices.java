package com.hack.cp.Data;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TestDataServices {

    // DB repository mock
    private Map<Long, TestData> repository = Arrays.asList(
                    new TestData[]{
                            new TestData(1, 1,"Датчик1","код 1","55","51"),
                            new TestData(2, 1,"Датчик1","код 1","55.3242","51.7923"),
                            new TestData(3, 88,"Датчик_1","51393","56.3242","52.7923"),
                    }).stream()
            .collect(Collectors.toConcurrentMap(s -> s.getId(), Function.identity()));

    // DB id sequence mock
    private AtomicLong sequence = new AtomicLong(3);

    public List<TestData> readAll() {
        return repository.values().stream().collect(Collectors.toList());
    }

    public TestData read(Long id) {
        return repository.get(id);
    }

    public TestData create(TestData testData) {
        long key = sequence.incrementAndGet();
        testData.setId(key);
        repository.put(key, testData);
        return testData;
    }

    public TestData update(Long id, TestData testData) {
        testData.setId(id);
        TestData oldStudent = repository.replace(id, testData);
        return oldStudent == null ? null : testData;
    }

    public void delete(Long id) {
        repository.remove(id);
    }
}
