package com.hack.PSBp.service;


import com.hack.PSBp.domain.Answer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class AnswerService {
    // DB repository mock
    private Map<Long, Answer> repository = Arrays.asList(
                    new Answer[]{
                            new Answer(1, 1,"где столовка?","хз","55"),
                            new Answer(2, 1,"что столовка?","ацтань","55"),
                            new Answer(3, 88,"когда столовка?","аташол","56"),
                    }).stream()
            .collect(Collectors.toConcurrentMap(s -> s.getId(), Function.identity()));

    // DB id sequence mock
    private AtomicLong sequence = new AtomicLong(3);

    public List<Answer> readAll() {
        return repository.values().stream().collect(Collectors.toList());
    }

    public Answer read(Long id) {
        return repository.get(id);
    }

    public Answer create(Answer testData) {
        long key = sequence.incrementAndGet();
        testData.setId(key);
        repository.put(key, testData);
        return testData;
    }

    public Answer update(Long id, Answer testData) {
        testData.setId(id);
        Answer oldStudent = repository.replace(id, testData);
        return oldStudent == null ? null : testData;
    }

    public void delete(Long id) {
        repository.remove(id);
    }

}
