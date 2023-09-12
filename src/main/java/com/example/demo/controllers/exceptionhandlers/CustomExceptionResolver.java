package com.example.demo.controllers.exceptionhandlers;

import java.util.Map;

import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

import com.example.demo.exceptions.ForbiddenException;
import com.example.demo.exceptions.NotFoundException;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;

@Component
public class CustomExceptionResolver extends DataFetcherExceptionResolverAdapter {

    Map<Class<? extends Throwable>, ErrorType> exMap = Map.of(
        NotFoundException.class, ErrorType.NOT_FOUND,
        ForbiddenException.class, ErrorType.FORBIDDEN
    );

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        return GraphqlErrorBuilder.newError()
            .errorType(exMap.getOrDefault(ex.getClass(), ErrorType.INTERNAL_ERROR))
            .message(ex.getMessage())
            .path(env.getExecutionStepInfo().getPath())
            .location(env.getField().getSourceLocation())
            .build();
    }
}
