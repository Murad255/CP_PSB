import httpClient from "@/client/httpClient";

export default class UserApiService {
    static API_ENDPOINT = "api/telemetry";
    static async getById() {
        const response = await httpClient().get(`${this.API_ENDPOINT}`);
        return response.data;
    }
}
