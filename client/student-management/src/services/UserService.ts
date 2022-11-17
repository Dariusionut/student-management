import { IRole } from './RoleService';
import axios, { AxiosResponse } from 'axios';
import { IAddress } from '../models/Address';

export interface IUser {
    id: number;
    role: IRole;
    address: IAddress;
    firstName: string;
    lastName: string;
    username: string;
    email: string;
    phoneNumber: string;
    dob: string;
    age: number;
    isActive: boolean;
}

interface CustomResponseList<T> {
    data: T[];
}

interface CustomResponse<T> {
    data: T;
}

const BASE_URL = `${process.env.REACT_APP_BASE_API_URL}/users`;

export const getUsers = async function (): Promise<IUser[]> {
    const resp: AxiosResponse<CustomResponseList<IUser>> = await axios.get(BASE_URL);
    return resp.data.data;
};

export const userById = async function (userId: number | string): Promise<IUser> {
    const url: string = `${BASE_URL}/${userId}`;
    const resp: AxiosResponse<CustomResponse<IUser>> = await axios.get(url);

    return resp.data.data;
};
