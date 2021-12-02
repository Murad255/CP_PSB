package com.hack.PSBp.service;

import com.hack.PSBp.domain.Result;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class ResultService {

    // DB repository mock
    private Map<Long, Result> repository = Arrays.asList(
                    new Result[]{
                            new Result(1, 1,44,"код 1"),
                            new Result(2, 1,35,"код 1"),
                            new Result(3, 88,25,"51393"),
                    }).stream()
            .collect(Collectors.toConcurrentMap(s -> s.getId(), Function.identity()));

    // DB id sequence mock
    private AtomicLong sequence = new AtomicLong(3);

    public List<Result> readAll() {
        return repository.values().stream().collect(Collectors.toList());
    }

    public Result read(Long id) {
        return repository.get(id);
    }

    public Result create(Result testData) {
        long key = sequence.incrementAndGet();
        testData.setId(key);
        repository.put(key, testData);
        return testData;
    }

    public Result update(Long id, Result testData) {
        testData.setId(id);
        Result oldStudent = repository.replace(id, testData);
        return oldStudent == null ? null : testData;
    }

    public void delete(Long id) {
        repository.remove(id);
    }
}
